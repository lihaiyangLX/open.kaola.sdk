package com.kaola.comm.item;

import com.kaola.base.KaolaRequest;

/**
 * 标准商品类目属性获取接口
 * @author LiHaiyang
 * 2018年3月16日
 */
public class KaolaItempropsGetRequest extends KaolaRequest {

	private Long category_id; // 类目id，必须是末级目录

	public KaolaItempropsGetRequest() {

		super("kaola.itemprops.get", KaolaItempropsGetResponse.class);
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}
}