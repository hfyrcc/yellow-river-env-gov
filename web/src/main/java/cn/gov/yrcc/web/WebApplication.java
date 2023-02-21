package cn.gov.yrcc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * web application
 *
 * @Author wylu
 * @Date 2023/2/21 上午 08:24
 */
@SpringBootApplication
@ComponentScan("cn.gov.yrcc")
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
