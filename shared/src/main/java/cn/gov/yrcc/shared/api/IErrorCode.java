package cn.gov.yrcc.shared.api;

/**
 * API返回码接口
 * Created by yogurt on 2023/3/1.
 */
public interface IErrorCode {
	/**
	 * 返回码
	 */
	long getCode();

	/**
	 * 返回信息
	 */
	String getMessage();
}
