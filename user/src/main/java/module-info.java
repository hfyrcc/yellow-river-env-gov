module cn.gov.yrcc.user {
	exports cn.gov.yrcc.user.account.usecase;

	requires cn.gov.yrcc.user.api;
	requires spring.context;
}
