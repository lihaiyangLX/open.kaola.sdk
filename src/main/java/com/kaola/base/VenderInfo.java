package com.kaola.base;

/**
 * 商家基本信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class VenderInfo {

	private Long vender_id; // 商家id

	private String vender_name; // 商家名称

	private String vender_alias; // 商家别名

	private String business_scope; // 主营范围

	private String refund_name; // 退货收件人姓名

	private String refund_tel; // 退货固定电话

	private String refund_mobile; // 退货手机号码

	private String refund_province; // 退货地址省份

	private String refund_city; // 退货地址城市

	private String refund_district; // 退货地址县区

	private String refund_address; // 退货详细地址

	public Long getVender_id() {
		return vender_id;
	}

	public void setVender_id(Long vender_id) {
		this.vender_id = vender_id;
	}

	public String getVender_name() {
		return vender_name;
	}

	public void setVender_name(String vender_name) {
		this.vender_name = vender_name;
	}

	public String getVender_alias() {
		return vender_alias;
	}

	public void setVender_alias(String vender_alias) {
		this.vender_alias = vender_alias;
	}

	public String getBusiness_scope() {
		return business_scope;
	}

	public void setBusiness_scope(String business_scope) {
		this.business_scope = business_scope;
	}

	public String getRefund_name() {
		return refund_name;
	}

	public void setRefund_name(String refund_name) {
		this.refund_name = refund_name;
	}

	public String getRefund_tel() {
		return refund_tel;
	}

	public void setRefund_tel(String refund_tel) {
		this.refund_tel = refund_tel;
	}

	public String getRefund_mobile() {
		return refund_mobile;
	}

	public void setRefund_mobile(String refund_mobile) {
		this.refund_mobile = refund_mobile;
	}

	public String getRefund_province() {
		return refund_province;
	}

	public void setRefund_province(String refund_province) {
		this.refund_province = refund_province;
	}

	public String getRefund_city() {
		return refund_city;
	}

	public void setRefund_city(String refund_city) {
		this.refund_city = refund_city;
	}

	public String getRefund_district() {
		return refund_district;
	}

	public void setRefund_district(String refund_district) {
		this.refund_district = refund_district;
	}

	public String getRefund_address() {
		return refund_address;
	}

	public void setRefund_address(String refund_address) {
		this.refund_address = refund_address;
	}
}