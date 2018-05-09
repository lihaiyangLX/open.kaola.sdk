package com.kaola.comm.item;

import java.util.Date;

/**
 * 修改指定SKU库存结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemSkuStockUpdateResponse {

	private int result; // 1:成功 0:失败

	private Date modify_time; // 修改时间，格式为yyyy-MM-dd HH:mm:ss

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
}