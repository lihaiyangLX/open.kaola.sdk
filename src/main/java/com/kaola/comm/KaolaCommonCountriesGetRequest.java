package com.kaola.comm;

import com.kaola.base.KaolaRequest;

/**
 * 类
 * @author LiHaiyang
 * 2018年4月28日
 */
public class KaolaCommonCountriesGetRequest extends KaolaRequest {

	public KaolaCommonCountriesGetRequest() {
		super("kaola.common.countries.get", KaolaCommonCountriesGetResponse.class);
	}
}
