package com.kaola.item;

import java.math.BigDecimal;

import com.kaola.base.Item;

public class RawSku extends Item {

	private BigDecimal market_private; // 市场价

	private BigDecimal sale_price; // 销售价

	private String bar_code; // 条形码

	private String material_num; // 商品料号

	private int stock_can_sale; // 可售库存

	private int stock_freeze; // 冻结库存

	private String first_unit_count; // 第一单位数量

	private int forbidden_status; // sku禁用状态 1：禁用 2：启用

	private String money_code; // 货币code

	private String outerId; // 外键

	private String second_unit_count; // 第二单位数量

	private int supply_price; // 供货价

	private String unit_count; // 售卖单位数量

	private int volume; // 体积,1-大件,2-中件,3-小件

	private int wareHouseId; // 仓库编号

	public BigDecimal getMarket_private() {
		return market_private;
	}

	public void setMarket_private(BigDecimal market_private) {
		this.market_private = market_private;
	}

	public BigDecimal getSale_price() {
		return sale_price;
	}

	public void setSale_price(BigDecimal sale_price) {
		this.sale_price = sale_price;
	}

	public String getBar_code() {
		return bar_code;
	}

	public void setBar_code(String bar_code) {
		this.bar_code = bar_code;
	}

	public String getMaterial_num() {
		return material_num;
	}

	public void setMaterial_num(String material_num) {
		this.material_num = material_num;
	}

	public int getStock_can_sale() {
		return stock_can_sale;
	}

	public void setStock_can_sale(int stock_can_sale) {
		this.stock_can_sale = stock_can_sale;
	}

	public int getStock_freeze() {
		return stock_freeze;
	}

	public void setStock_freeze(int stock_freeze) {
		this.stock_freeze = stock_freeze;
	}

	public String getFirst_unit_count() {
		return first_unit_count;
	}

	public void setFirst_unit_count(String first_unit_count) {
		this.first_unit_count = first_unit_count;
	}

	public int getForbidden_status() {
		return forbidden_status;
	}

	public void setForbidden_status(int forbidden_status) {
		this.forbidden_status = forbidden_status;
	}

	public String getMoney_code() {
		return money_code;
	}

	public void setMoney_code(String money_code) {
		this.money_code = money_code;
	}

	public String getOuterId() {
		return outerId;
	}

	public void setOuterId(String outerId) {
		this.outerId = outerId;
	}

	public String getSecond_unit_count() {
		return second_unit_count;
	}

	public void setSecond_unit_count(String second_unit_count) {
		this.second_unit_count = second_unit_count;
	}

	public int getSupply_price() {
		return supply_price;
	}

	public void setSupply_price(int supply_price) {
		this.supply_price = supply_price;
	}

	public String getUnit_count() {
		return unit_count;
	}

	public void setUnit_count(String unit_count) {
		this.unit_count = unit_count;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(int wareHouseId) {
		this.wareHouseId = wareHouseId;
	}
}