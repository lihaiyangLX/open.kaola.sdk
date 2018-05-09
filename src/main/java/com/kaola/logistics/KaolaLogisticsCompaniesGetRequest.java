package com.kaola.logistics;

import com.kaola.base.KaolaRequest;

/**
 * 快递接口
 * @author LiHaiyang
 * 2018年5月3日
 */
public class KaolaLogisticsCompaniesGetRequest extends KaolaRequest {

	public KaolaLogisticsCompaniesGetRequest() {
		super("kaola.logistics.companies.get", KaolaLogisticsCompaniesGetResponse.class);
	}
}