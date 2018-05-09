package com.kaola.base;

/**
 * 行邮税号
 * @author LiHaiyang
 * 2018年3月19日
 */
public class TaxNo {

	private String tax_no; // 行邮税号code

	private String tax_scope; // 行邮税号适用类目

	public String getTax_no() {
		return tax_no;
	}

	public void setTax_no(String tax_no) {
		this.tax_no = tax_no;
	}

	public String getTax_scope() {
		return tax_scope;
	}

	public void setTax_scope(String tax_scope) {
		this.tax_scope = tax_scope;
	}
}