package com.kaola.item;

/**
 * 商品基本信息
 * @author LiHaiyang
 * 2018年3月16日
 */
public class RawItemEdit {

	private Long id; // 商品id

	private Long business_id; // 商家id

	private Long ware_home_id; // 一商多仓仓库号

	private String name; // 商品名称

	private String sub_title; // 副标题

	private String short_title; // 短标题

	private String tem_words_desc; // 十字描述

	private String item_NO; // 商品货号

	private String brand_id; // 品牌id

	private String brand_name; // 品牌号

	private String original_contry_code_id; // 原产国id

	private String consign_area; // 发货地

	private String consign_area_id; // 发货地id

	private String description; // 商品描述

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(Long business_id) {
		this.business_id = business_id;
	}

	public Long getWare_home_id() {
		return ware_home_id;
	}

	public void setWare_home_id(Long ware_home_id) {
		this.ware_home_id = ware_home_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub_title() {
		return sub_title;
	}

	public void setSub_title(String sub_title) {
		this.sub_title = sub_title;
	}

	public String getShort_title() {
		return short_title;
	}

	public void setShort_title(String short_title) {
		this.short_title = short_title;
	}

	public String getTem_words_desc() {
		return tem_words_desc;
	}

	public void setTem_words_desc(String tem_words_desc) {
		this.tem_words_desc = tem_words_desc;
	}

	public String getItem_NO() {
		return item_NO;
	}

	public void setItem_NO(String item_NO) {
		this.item_NO = item_NO;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getOriginal_contry_code_id() {
		return original_contry_code_id;
	}

	public void setOriginal_contry_code_id(String original_contry_code_id) {
		this.original_contry_code_id = original_contry_code_id;
	}

	public String getConsign_area() {
		return consign_area;
	}

	public void setConsign_area(String consign_area) {
		this.consign_area = consign_area;
	}

	public String getConsign_area_id() {
		return consign_area_id;
	}

	public void setConsign_area_id(String consign_area_id) {
		this.consign_area_id = consign_area_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}