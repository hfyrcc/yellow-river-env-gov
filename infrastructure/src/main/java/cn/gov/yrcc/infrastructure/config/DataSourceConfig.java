package cn.gov.yrcc.infrastructure.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * datasource config base on mysql
 *
 * @Author wylu
 * @Date 2023/2/21 下午 04:00
 */
@Slf4j
@Configuration
public class DataSourceConfig {

	@Primary
	@Bean(name = "masterDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.druid")
	public DataSource masterDataSource() {
		log.info("[DataSourceConfig] masterDataSource() start create master database!");
		return DruidDataSourceBuilder.create().build();
	}

	@Primary
	@Bean("jdbcTemplate")
	public JdbcTemplate jdbcTemplate(@Qualifier("masterDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
