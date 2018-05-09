package com.kaola.item;


/**
 * SKU基本信息
 * @author LiHaiyang
 * 2018年3月16日
 */
public class RawSkuProperty {

	private Long id; // 主键

	private Long sku_id; // SKU id

	private Long business_id; // 商家id

	private String property_value_id; // 属性值id

	private String image_url; // 图片地址

	private int is_hidden; // 是否隐藏

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSku_id() {
		return sku_id;
	}

	public void setSku_id(Long sku_id) {
		this.sku_id = sku_id;
	}

	public Long getBusiness_id() {
		return business_id;
	}

	public void setBusiness_id(Long business_id) {
		this.business_id = business_id;
	}

	public String getProperty_value_id() {
		return property_value_id;
	}

	public void setProperty_value_id(String property_value_id) {
		this.property_value_id = property_value_id;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public int getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(int is_hidden) {
		this.is_hidden = is_hidden;
	}
}