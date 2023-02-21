package cn.gov.yrcc.docs.document.usecase;

import cn.gov.yrcc.docs.document.api.DocsService;
import org.springframework.stereotype.Service;

/**
 * 文档服务实现
 *
 * @Author wylu
 * @Date 2023/2/21 下午 04:27
 */
@Service
public class DocsServiceImpl implements DocsService {

	@Override
	public String getDocsServeStatus() {
		return "Timestamp is " + System.currentTimeMillis();
	}
}
