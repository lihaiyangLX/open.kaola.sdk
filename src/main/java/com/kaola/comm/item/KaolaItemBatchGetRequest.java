package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 批量获取商品信息
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItemBatchGetRequest extends KaolaRequest {

	private String[] key_list;

	public String[] getKey_list() {
		return key_list;
	}

	public void setKey_list(String[] key_list) {
		this.key_list = key_list;
	}

	public KaolaItemBatchGetRequest() {
		super("kaola.item.batch.get", KaolaItemBatchGetResponse.class);
	}
}