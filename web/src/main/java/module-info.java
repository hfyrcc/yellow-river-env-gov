open module cn.gov.yrcc.web {
	// 以下是导出一方包模块

	// 以下是导入三方包模块
	//requires cn.gov.yrcc.infrastructure;
	requires cn.gov.yrcc.docs;

	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.beans;
	requires spring.web;
	requires java.annotation;
	requires org.mybatis.spring;
	requires java.sql; // 解决启动报错的问题
}
