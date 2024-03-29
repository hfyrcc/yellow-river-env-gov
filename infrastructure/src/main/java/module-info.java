module cn.gov.yrcc.infrastructure {
	// 以下是导出一方包模块
	exports cn.gov.yrcc.infrastructure.util;
	exports cn.gov.yrcc.infrastructure.config;

	// allow reflection
	opens cn.gov.yrcc.infrastructure.config to spring.core;
	opens cn.gov.yrcc.infrastructure.component to spring.core;
    exports cn.gov.yrcc.infrastructure.security.config;
    opens cn.gov.yrcc.infrastructure.security.config to spring.core;
	opens cn.gov.yrcc.infrastructure.security.component to spring.core;
	exports cn.gov.yrcc.infrastructure.security.util;

	// 以下是导入三方包模块
	requires static lombok;
	requires spring.context;
	requires com.fasterxml.jackson.annotation;
	requires com.fasterxml.jackson.core;
	requires com.fasterxml.jackson.databind;
	requires commons.lang3;
	requires org.slf4j;
	requires spring.boot;
	requires spring.beans;
	requires java.sql;
	requires druid.spring.boot.starter;
	requires spring.jdbc;
	requires mybatis.plus.extension;
	requires mybatis.plus.core;
	requires org.mybatis;
	requires spring.core;
	requires spring.security.config;
	requires spring.web;
	requires spring.security.web;
    requires spring.security.core;
	requires javax.servlet.api;
	requires java.annotation;
	requires spring.boot.autoconfigure;
	requires spring.security.crypto;
	requires hutool.all;
	requires jjwt.api;
	requires cn.gov.yrcc.shared;
}
