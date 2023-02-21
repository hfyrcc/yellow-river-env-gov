package cn.gov.yrcc.user.account.usecase;

import cn.gov.yrcc.user.account.api.AccountService;
import org.springframework.stereotype.Service;

/**
 * 账号服务实现
 *
 * @Author wylu
 * @Date 2023/2/21 下午 07:38
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public String getAccountName() {
		return "AccountName";
	}
}
