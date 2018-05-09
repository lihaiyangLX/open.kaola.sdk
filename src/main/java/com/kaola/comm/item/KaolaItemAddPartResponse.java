package com.kaola.comm.item;

import java.util.Date;

import com.kaola.item.SkuOuterIdResult;

/**
 * 商品新增返回
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaItemAddPartResponse {

	private String key; // 新增的商品的key

	private Date create_time; // 创建时间，格式为yyyy-MM-dd HH:mm:ss

	private SkuOuterIdResult[] sku_keys; // 增加sku的id对照关系

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public SkuOuterIdResult[] getSku_keys() {
		return sku_keys;
	}

	public void setSku_keys(SkuOuterIdResult[] sku_keys) {
		this.sku_keys = sku_keys;
	}
}