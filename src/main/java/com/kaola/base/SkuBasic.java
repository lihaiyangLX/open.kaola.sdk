package com.kaola.base;

import java.math.BigDecimal;

/**
 * SKU基本信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class SkuBasic {

	private String sku_key; // SKU Key

	private String id; // SKU编号

	private String outer_id; // 上架外部唯一编码(目前不支持此字段编辑，请期待)

	private String barcode; // 条形码

	public String getSku_key() {
		return sku_key;
	}

	public void setSku_key(String sku_key) {
		this.sku_key = sku_key;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOuter_id() {
		return outer_id;
	}

	public void setOuter_id(String outer_id) {
		this.outer_id = outer_id;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public BigDecimal getSale_price() {
		return sale_price;
	}

	public void setSale_price(BigDecimal sale_price) {
		this.sale_price = sale_price;
	}

	public String getWarehouse_name() {
		return warehouse_name;
	}

	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}

	public Long getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(Long warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public int getStock_cansale() {
		return stock_cansale;
	}

	public void setStock_cansale(int stock_cansale) {
		this.stock_cansale = stock_cansale;
	}

	public int getStock_freeze() {
		return stock_freeze;
	}

	public void setStock_freeze(int stock_freeze) {
		this.stock_freeze = stock_freeze;
	}

	private BigDecimal sale_price; // 销售价

	private String warehouse_name; // 仓库名称

	private Long warehouse_id; // 仓库id

	private int stock_cansale; // 可售库存

	private int stock_freeze; // 冻结库存
}