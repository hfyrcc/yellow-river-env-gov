module cn.gov.yrcc.docs {
	// 以下是导入一方包模块
	exports cn.gov.yrcc.docs.usecase;

	//以下是导入三方包模块
	requires cn.gov.yrcc.docs.api;

	requires spring.context;
	requires runtime.sofa.boot;
}
