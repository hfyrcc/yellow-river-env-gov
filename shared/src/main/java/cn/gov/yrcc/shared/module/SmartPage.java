package cn.gov.yrcc.shared.module;

import com.github.pagehelper.PageInfo;
import java.io.Serializable;
import java.util.List;

/**
 * SmartPage that used in paging query
 *
 * @Author wylu
 * @Date 2023/2/20 下午 09:47
 */
public class SmartPage<T extends Serializable> implements Serializable {

	private static final long serialVersionUID = 8556478602617190457L;
	private long total;
	private List<T> list;

	public SmartPage() {
		// privatization construction method
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getList() {
		return this.list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	/**
	 * 结果转换
	 *
	 * @param pageInfo
	 * @param <T>
	 * @return
	 */
	public static <T extends Serializable> SmartPage<T> transfer(PageInfo<T> pageInfo) {
		SmartPage<T> page = new SmartPage<>();
		page.setList(pageInfo.getList());
		page.setTotal(pageInfo.getTotal());
		return page;
	}
}
