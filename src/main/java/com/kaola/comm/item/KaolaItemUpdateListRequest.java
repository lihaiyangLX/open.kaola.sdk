package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * KaolaItemUpdateListRequest.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class KaolaItemUpdateListRequest extends KaolaRequest {

	private String[] key_list;

	private String[] outer_id_list;

	public String[] getKey_list() {
		return key_list;
	}

	public void setKey_list(String[] key_list) {
		this.key_list = key_list;
	}

	public String[] getOuter_id_list() {
		return outer_id_list;
	}

	public void setOuter_id_list(String[] outer_id_list) {
		this.outer_id_list = outer_id_list;
	}

	public KaolaItemUpdateListRequest() {
		super("kaola.item.update.listing", KaolaItemUpdateListResponse.class);
	}
}