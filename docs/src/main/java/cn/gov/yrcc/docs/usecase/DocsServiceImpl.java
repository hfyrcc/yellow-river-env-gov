package cn.gov.yrcc.docs.usecase;

import cn.gov.yrcc.docsapi.api.DocsService;
import com.alipay.sofa.runtime.api.annotation.SofaService;

/**
 * 文档服务实现
 *
 * @Author wylu
 * @Date 2023/2/21 下午 04:27
 */
@SofaService
public class DocsServiceImpl implements DocsService {

	@Override
	public String getDocsServeStatus() {
		return "Timestamp is " + System.currentTimeMillis();
	}
}
