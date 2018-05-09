package com.kaola.comm.vender;

import com.kaola.base.KaolaRequest;

/**
 * 获取商家类目
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaVenderCategoryGetRequest extends KaolaRequest {

	public KaolaVenderCategoryGetRequest() {
		super("kaola.vender.category.get", KaolaVenderCategoryGetResponse.class);
	}
}