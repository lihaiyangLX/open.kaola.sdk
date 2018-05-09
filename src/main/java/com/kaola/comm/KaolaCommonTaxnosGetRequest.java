package com.kaola.comm;

import com.kaola.base.KaolaRequest;

/**
 * 获取所有行邮税号信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaCommonTaxnosGetRequest extends KaolaRequest {

	public KaolaCommonTaxnosGetRequest() {
		super("kaola.common.taxnos.get", KaolaCommonTaxnosGetResponse.class);
	}
}