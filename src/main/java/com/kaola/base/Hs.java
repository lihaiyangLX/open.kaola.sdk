package com.kaola.base;

/**
 * 考拉哈希
 * @author LiHaiyang
 * 2018年4月17日
 */
public class Hs {

	private String hs_code; // Hs编码code

	private String hs_key; // 国家分类名称和HS编码组合唯一

	private String national_category; // 国家分类名

	private String vat_code; // 增值税号

	private String consumer_code; // 消费税号

	private String firstUnitCode; // 法定第一单位

	private String SecondUnitCode; // 法定第二单位

	public String getHs_code() {
		return hs_code;
	}

	public void setHs_code(String hs_code) {
		this.hs_code = hs_code;
	}

	public String getHs_key() {
		return hs_key;
	}

	public void setHs_key(String hs_key) {
		this.hs_key = hs_key;
	}

	public String getNational_category() {
		return national_category;
	}

	public void setNational_category(String national_category) {
		this.national_category = national_category;
	}

	public String getVat_code() {
		return vat_code;
	}

	public void setVat_code(String vat_code) {
		this.vat_code = vat_code;
	}

	public String getConsumer_code() {
		return consumer_code;
	}

	public void setConsumer_code(String consumer_code) {
		this.consumer_code = consumer_code;
	}

	public String getFirstUnitCode() {
		return firstUnitCode;
	}

	public void setFirstUnitCode(String firstUnitCode) {
		this.firstUnitCode = firstUnitCode;
	}

	public String getSecondUnitCode() {
		return SecondUnitCode;
	}

	public void setSecondUnitCode(String secondUnitCode) {
		SecondUnitCode = secondUnitCode;
	}
}