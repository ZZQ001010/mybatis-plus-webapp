package com.zznr.anshen.utils;

import java.util.List;

/**
 * 前后台交换数据的pojo
 * 
 * @author ZZQ.Hacker
 *
 */
public class EUDataGridResult {

	private Integer page = 1 ; // 当前页面
	private Integer pageSize =20; // 页面的尺寸

	private Long total;

	private List<?> data;

	private Boolean success = true;
	
	private String msg ; 
	
	

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

}
