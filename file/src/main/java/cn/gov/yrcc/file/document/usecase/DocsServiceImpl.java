package cn.gov.yrcc.file.document.usecase;

import cn.gov.yrcc.file.document.api.DocsService;
import org.springframework.stereotype.Service;

/**
 * @Author wylu
 * @Date 2023/3/6 上午 10:12
 */
@Service
public class DocsServiceImpl implements DocsService {

    @Override
    public String getDocsServeStatus() {
        return "Timestamp is " + System.currentTimeMillis();
    }
}
