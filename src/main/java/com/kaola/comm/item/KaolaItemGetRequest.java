package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 单个商品获取接口
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemGetRequest extends KaolaRequest {

	private String key; // 商品的key

	public KaolaItemGetRequest() {
		super("kaola.item.get", KaolaItemGetResponse.class);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}