module cn.gov.yrcc.shared {
	// 以下是导出一方包模块
	exports cn.gov.yrcc.shared.constant;
	exports cn.gov.yrcc.shared.exception;
	exports cn.gov.yrcc.shared.module;
	exports cn.gov.yrcc.shared.api;

	// 以下是导入三方包模块
	requires static lombok;
	requires pagehelper;
    requires spring.data.commons;
}
