package com.kaola.sdk.response;

import java.util.List;

import com.kaola.sdk.base.KopResponse;
import com.kaola.sdk.base.bean.Warehouse;

/**
 * VenderWarehouseGetResponse.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class VenderWarehouseGetResponse extends KopResponse {

	private static final long serialVersionUID = 1L;

	private int total_count;

	private List<Warehouse> warehouses;

	public int getTotal_count() {
		return total_count;
	}

	public void setTotal_count(int total_count) {
		this.total_count = total_count;
	}

	public List<Warehouse> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<Warehouse> warehouses) {
		this.warehouses = warehouses;
	}
}