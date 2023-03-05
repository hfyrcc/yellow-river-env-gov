package cn.gov.yrcc.infrastructure.security.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * SpringSecurity白名单资源路径配置
 * Created by yogurt on 2023/3/1.
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
public class IgnoreUrlsConfig {
	private List<String> urls = new ArrayList<>();
}
