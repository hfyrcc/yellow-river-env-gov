package cn.gov.yrcc.infrastructure.component;

import cn.gov.yrcc.shared.api.CommonResult;
import cn.hutool.json.JSONUtil;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * 自定义未登录或者token失效时的返回结果
 * Created by yogurt on 2023/3/1.
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
	@Override
	public void commence(javax.servlet.http.HttpServletRequest request,
						 javax.servlet.http.HttpServletResponse response,
						 AuthenticationException authException) throws IOException, ServletException {
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Cache-Control","no-cache");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().println(JSONUtil.parse(CommonResult.unauthorized(authException.getMessage())));
		response.getWriter().flush();
	}
}
