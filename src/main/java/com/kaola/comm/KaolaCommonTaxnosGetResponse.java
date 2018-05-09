package com.kaola.comm;

import com.kaola.base.TaxNo;

/**
 * 获取所有行邮税号信息结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaCommonTaxnosGetResponse {

	private TaxNo[] taxno_list;

	public TaxNo[] getTaxno_list() {
		return taxno_list;
	}

	public void setTaxno_list(TaxNo[] taxno_list) {
		this.taxno_list = taxno_list;
	}
}