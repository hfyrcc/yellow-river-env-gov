module cn.gov.yrcc.mbg {
	requires java.sql;
	requires mysql.connector.java;
	requires org.mybatis.generator;
	requires org.mybatis;
	requires swagger.annotations;
	exports cn.gov.yrcc;
}
