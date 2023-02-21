package cn.gov.yrcc.web.controller.docs;

import cn.gov.yrcc.docsapi.api.DocsService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文档服务controller
 *
 * @Author wylu
 * @Date 2023/2/21 下午 04:33
 */
@RestController
@RequestMapping("/docs")
public class DocsController {

	@SofaReference
	private DocsService docsService;

	@GetMapping("/getStatus")
	public String getDocsServeStatus() {
		return docsService.getDocsServeStatus();
	}
}
