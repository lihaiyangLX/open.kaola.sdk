package com.kaola.sdk.response;

import java.util.Date;

import com.kaola.item.SkuOuterIdResult;
import com.kaola.sdk.base.KopResponse;

/**
 * ItemAddResponse.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public class ItemAddResponse extends KopResponse {

	private static final long serialVersionUID = 1L;

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