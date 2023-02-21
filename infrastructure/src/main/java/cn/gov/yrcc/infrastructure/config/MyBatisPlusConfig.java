package cn.gov.yrcc.infrastructure.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Mybatis plus config
 *
 * @Author wylu
 * @Date 2023/2/21 下午 04:06
 */
@Slf4j
@Configuration
public class MyBatisPlusConfig {

	@Bean("mybatisPlusInterceptor")
	public MybatisPlusInterceptor mybatisPlusInterceptor() {
		var interceptor = new MybatisPlusInterceptor();
		// 拦截器容器
		List<InnerInterceptor> list = new ArrayList<>();
		// 分页插件拦截器
		var paginationInnerInterceptor = new PaginationInnerInterceptor();
		list.add(paginationInnerInterceptor);

		// 防止全表更新与删除拦截器
		var blockAttackInnerInterceptor = new BlockAttackInnerInterceptor();
		list.add(blockAttackInnerInterceptor);

		interceptor.setInterceptors(list);
		return interceptor;
	}

	@Bean("sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactory(
			@Qualifier("masterDataSource") DataSource dataSource,
			@Qualifier("mybatisPlusInterceptor") MybatisPlusInterceptor mybatisPlusInterceptor)
			throws Exception {
		var sessionFactory = new MybatisSqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);

		var configuration = new MybatisConfiguration();
		configuration.setJdbcTypeForNull(JdbcType.NULL);
		configuration.setCacheEnabled(true);
		// 解决属性大写变小写加下划线的问题
		configuration.setMapUnderscoreToCamelCase(false);
		configuration.setCallSettersOnNulls(true);
		// 正式环境需要屏蔽：MybatisPlus执行SQL时，将其打印出来
		// configuration.setLogImpl(org.apache.ibatis.logging.stdout.StdOutImpl.class);
		sessionFactory.setConfiguration(configuration);

		sessionFactory.setMapperLocations(resolveMapperLocations());

		// 设置插件
		sessionFactory.setPlugins(mybatisPlusInterceptor);
		return sessionFactory.getObject();
	}

	/**
	 * 根据指定的mapper location设置xml位置
	 *
	 * @return Resource[]
	 */
	private Resource[] resolveMapperLocations() {
		var resourceResolver = new PathMatchingResourcePatternResolver();
		var mapperList = Arrays.asList("classpath*:mappers/*/*.xml", "classpath*:mappers/*/*/*.xml");
		var resources = new ArrayList<Resource>();
		for (var mapperLocation : mapperList) {
			try {
				var mappers = resourceResolver.getResources(mapperLocation);
				resources.addAll(Arrays.asList(mappers));
			} catch (IOException e) {
				log.error("[MybatisPlusConfig] resolveMapperLocations() occurred exception!", e);
			}
		}
		return resources.toArray(new Resource[0]);
	}
}
