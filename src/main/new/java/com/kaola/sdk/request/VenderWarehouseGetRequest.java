package com.kaola.sdk.request;

import java.util.Map;

import com.kaola.sdk.base.KopRequest;
import com.kaola.sdk.response.VenderWarehouseGetResponse;
import com.kaola.utils.ObjectFieldManager;

/**
 * VenderWarehouseGetRequest.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class VenderWarehouseGetRequest implements KopRequest<VenderWarehouseGetResponse> {

	private String warehouse_id; // 仓库编号

	private String warehouse_name; // 仓库名称

	private String page_no; // 页数

	private String page_size; // 每页个数

	public String getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	public String getPage_no() {
		return page_no;
	}

	public void setPage_no(String page_no) {
		this.page_no = page_no;
	}

	public String getPage_size() {
		return page_size;
	}

	public void setPage_size(String page_size) {
		this.page_size = page_size;
	}

	@Override
	public String getApiMethodName() {
		return "kaola.vender.warehouse.get";
	}

	@Override
	public Map<String, String> getTextParams() {
		return ObjectFieldManager.StringMapReader(this);
	}

	@Override
	public Long getTimestamp() {
		return System.currentTimeMillis();
	}

	@Override
	public void setTimestamp(Long timestamp) {}

	@Override
	public Class<VenderWarehouseGetResponse> getResponseClass() {
		return VenderWarehouseGetResponse.class;
	}

}