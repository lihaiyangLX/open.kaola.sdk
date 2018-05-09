package com.kaola.comm;

import com.kaola.base.KaolaRequest;

/**
 * 获取所有度量单位信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaCommonUnitcodesGetRequest extends KaolaRequest {

	public KaolaCommonUnitcodesGetRequest() {
		super("kaola.common.unitcodes.get", KaolaCommonUnitcodesGetResponse.class);
	}
}