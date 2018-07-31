package com.kaola.comm.vender;

import com.kaola.base.KaolaRequest;

/**
 * 获取仓库
 * @author LiHaiyang
 * 2018年5月2日
 */
public class KaolaVenderWarehouseGetRequest extends KaolaRequest {

	public KaolaVenderWarehouseGetRequest() { // kaola.vender.warehouse.get 
		super("kaola.vender.warehouse.get", KaolaVenderWarehouseGetResponse.class);
	}

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
}