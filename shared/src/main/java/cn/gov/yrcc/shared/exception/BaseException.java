package cn.gov.yrcc.shared.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * base exception
 *
 * @Author wylu
 * @Date 2023/2/20 下午 09:51
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseException extends RuntimeException {

	private static final long serialVersionUID = -5823194798805923217L;

	private Integer code;
	private String message;

	/**
	 * construction method
	 *
	 * @param exceptionEnum exceptionEnum
	 */
	public BaseException(ExceptionEnum exceptionEnum) {
		this.code = exceptionEnum.getCode();
		this.message = exceptionEnum.getMessage();
	}
}
