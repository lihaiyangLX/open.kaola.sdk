package com.kaola.sdk.request;

import java.util.Map;

import com.kaola.sdk.base.KopRequest;
import com.kaola.sdk.response.ItemAddResponse;
import com.kaola.utils.ObjectFieldManager;

/**
 * ItemAddRequest.java
 * @author LiHaiyang
 * 2018年5月23日
 */
public class ItemAddRequest implements KopRequest<ItemAddResponse> {

	private String name; // *商品名称

	private String sub_title; // *副标题

	private String short_title; // *短标题

	private String ten_words_desc; // *十字描述

	private String item_NO; // *商品货号

	private Long brand_id; // *品牌id

	private String original_country_code_id; // *原产国id

	private String description; // 详情描述

	private Long category_id; // *所属类目id

	private String warehouse_id; // 仓库编号

	private String tax_code; // 行邮税号code，参考接口kaola.common.taxnos.get 注意：当商家入驻模式是跨境保税或者跨境直邮时必填

	private String hs_code; // Hs_code,参考接口:kaola.common.hscodes.get

	private String express_fee; // 运费

	private String gross_weight; // *商品毛重（单位kg）

	private String item_outer_id; // *商品外键id

	private String unit_code; // 度量单位code，参考接口kaola.common.unitcodes.get 注意：当商家入驻模式是跨境保税或者跨境直邮时必填

	private String property_valueId_list; // 商品对应的预定义(下拉/单选/多选)属性值列表，

	private String text_property_name_id; // 商品对应的自定义(单行/多行)文本框属性名id和属性值列表，属性名和属性值用^分隔，多个属性之间用|分隔

	private String image_urls; // 商品图片url和类型列表，url和类型用^分隔,多个图片之间用|分隔, 商品类型1:商品主图片 2:APP标示。1和2都至少传一张图片。

	private String sku_market_prices; // Sku市场价，多个sku的市场价用|分隔,支持2位小数，单位:元

	private String sku_sale_prices; // Sku销售价，多个sku的销售价用|分隔,支持2位小数，单位:元 注意：如果商家是按供货价结算，那么系统将忽略该字段

	private String sku_barcode; // Sku条形码，多个sku的条形码用|分隔

	private String sku_stock; // Sku库存，整数，多个Sku的库存用|分隔

	private String sku_property_value; // 录入格式：(属性项id:属性值id:属性项中文:图片url|属性项id:-1:自定义属性值:图片url) 同一个sku不同的属性之间用;分隔，不同的sku属性之间用|分隔，只有颜色属性会有图片url

	private String sku_outer_id; // Sku外键id，不同的sku属性之间用|分隔

	@Override
	public String getApiMethodName() {
		return "kaola.item.addPart";
	}

	@Override
	public Map<String, String> getTextParams() {

		return ObjectFieldManager.StringMapReader(this);
	}

	@Override
	public Long getTimestamp() {
		return System.currentTimeMillis();
	}

	@Override
	public void setTimestamp(Long timestamp) {}

	@Override
	public Class<ItemAddResponse> getResponseClass() {
		// TODO Auto-generated method stub
		return ItemAddResponse.class;
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

	public String getTen_words_desc() {
		return ten_words_desc;
	}

	public void setTen_words_desc(String ten_words_desc) {
		this.ten_words_desc = ten_words_desc;
	}

	public String getItem_NO() {
		return item_NO;
	}

	public void setItem_NO(String item_NO) {
		this.item_NO = item_NO;
	}

	public Long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}

	public String getOriginal_country_code_id() {
		return original_country_code_id;
	}

	public void setOriginal_country_code_id(String original_country_code_id) {
		this.original_country_code_id = original_country_code_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getWarehouse_id() {
		return warehouse_id;
	}

	public void setWarehouse_id(String warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public String getTax_code() {
		return tax_code;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}

	public String getHs_code() {
		return hs_code;
	}

	public void setHs_code(String hs_code) {
		this.hs_code = hs_code;
	}

	public String getExpress_fee() {
		return express_fee;
	}

	public void setExpress_fee(String express_fee) {
		this.express_fee = express_fee;
	}

	public String getGross_weight() {
		return gross_weight;
	}

	public void setGross_weight(String gross_weight) {
		this.gross_weight = gross_weight;
	}

	public String getItem_outer_id() {
		return item_outer_id;
	}

	public void setItem_outer_id(String item_outer_id) {
		this.item_outer_id = item_outer_id;
	}

	public String getUnit_code() {
		return unit_code;
	}

	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}

	public String getProperty_valueId_list() {
		return property_valueId_list;
	}

	public void setProperty_valueId_list(String property_valueId_list) {
		this.property_valueId_list = property_valueId_list;
	}

	public String getText_property_name_id() {
		return text_property_name_id;
	}

	public void setText_property_name_id(String text_property_name_id) {
		this.text_property_name_id = text_property_name_id;
	}

	public String getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(String image_urls) {
		this.image_urls = image_urls;
	}

	public String getSku_market_prices() {
		return sku_market_prices;
	}

	public void setSku_market_prices(String sku_market_prices) {
		this.sku_market_prices = sku_market_prices;
	}

	public String getSku_sale_prices() {
		return sku_sale_prices;
	}

	public void setSku_sale_prices(String sku_sale_prices) {
		this.sku_sale_prices = sku_sale_prices;
	}

	public String getSku_barcode() {
		return sku_barcode;
	}

	public void setSku_barcode(String sku_barcode) {
		this.sku_barcode = sku_barcode;
	}

	public String getSku_stock() {
		return sku_stock;
	}

	public void setSku_stock(String sku_stock) {
		this.sku_stock = sku_stock;
	}

	public String getSku_property_value() {
		return sku_property_value;
	}

	public void setSku_property_value(String sku_property_value) {
		this.sku_property_value = sku_property_value;
	}

	public String getSku_outer_id() {
		return sku_outer_id;
	}

	public void setSku_outer_id(String sku_outer_id) {
		this.sku_outer_id = sku_outer_id;
	}
}