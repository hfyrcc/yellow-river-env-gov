package cn.gov.yrcc.infrastructure.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限相关业务接口
 * Created by yogurt on 2023/3/1.
 */
public interface DynamicSecurityService {
	/**
	 * 加载资源ANT通配符和资源对应MAP
	 */
	Map<String, ConfigAttribute> loadDataSource();
}
