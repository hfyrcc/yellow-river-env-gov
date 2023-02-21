open module cn.gov.yrcc.docs {
	// 以下是导入一方包模块
	exports cn.gov.yrcc.docs.document.usecase;

	//以下是导入三方包模块
	requires cn.gov.yrcc.docs.api;
	requires cn.gov.yrcc.user.api;

	requires java.annotation;
	requires spring.context;
}
