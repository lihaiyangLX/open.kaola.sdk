package com.kaola.comm;

import java.util.ArrayList;
import java.util.List;

import com.kaola.base.Country;

/**
 * 获取所有国家信息
 * @author LiHaiyang
 * 2018年4月28日
 */
public class KaolaCommonCountriesGetResponse {

	private List<Country> country_list = new ArrayList<>();

	public List<Country> getCountry_list() {
		return country_list;
	}

	public void setCountry_list(List<Country> country_list) {
		this.country_list = country_list;
	}
}