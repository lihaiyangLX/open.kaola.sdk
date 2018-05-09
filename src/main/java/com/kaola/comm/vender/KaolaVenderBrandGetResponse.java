package com.kaola.comm.vender;

import java.util.List;

import com.kaola.base.BrandInfo;

/**
 * 获取商家品牌结果
 * @author LiHaiyang
 * 2018年3月19日
 */
public class KaolaVenderBrandGetResponse {

	private List<BrandInfo> brand_list;

	public List<BrandInfo> getBrand_list() {
		return brand_list;
	}

	public void setBrand_list(List<BrandInfo> brand_list) {
		this.brand_list = brand_list;
	}
}