package com.kaola.comm.vender;

import com.kaola.base.KaolaRequest;

/**
 * 获取商家基本信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaVenderInfoGetRequest extends KaolaRequest {

	public KaolaVenderInfoGetRequest() {
		super("kaola.vender.info.get", KaolaVenderInfoGetResponse.class);
	}
}