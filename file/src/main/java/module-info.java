open module cn.gov.yrcc.file {
	// 以下是导入一方包模块
	exports cn.gov.yrcc.file.document.usecase;
	exports cn.gov.yrcc.file.document.api;

	//以下是导入三方包模块
	requires java.annotation;
	requires spring.context;
}
