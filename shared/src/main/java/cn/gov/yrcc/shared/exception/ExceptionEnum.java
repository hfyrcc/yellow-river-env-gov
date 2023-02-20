package cn.gov.yrcc.shared.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 错误分类：
 * 1.[1000-1999]:
 * 2.[2000-2999]:
 * 3.[3000-3999]:
 * 4.[4000-4999]:
 * 5.[5000-5999]:
 *
 * @Author wylu
 * @Date 2023/2/20 下午 10:07
 */
@Getter
@AllArgsConstructor
public enum ExceptionEnum {

	PARAMETER_ERROR(1000, "参数错误");

	private final int code;
	private final String message;
}
