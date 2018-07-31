package com.kaola.sdk.base.bean;

/**
 * Warehouse.java
 * @author LiHaiyang
 * 2018年5月25日
 */
public class Warehouse {

	private String contact_mobilephone; // 联系人移动电话
	private String contact_name; // 联系人姓名
	private String contact_telephone; // 联系人座机
	private String deliver_address; // 发货地址
	private String return_address; // 退货地址
	private String return_contact_mobilephone; // 退货人移动电话
	private String return_contact_name; // 退货人姓名
	private String return_contact_telephone; // 退货人座机
	private int warehouse_id; // 仓库编号
	private String warehouse_name; // 严选测试仓库	仓库名称

	public String getContact_mobilephone() {
		return contact_mobilephone;
	}
	public void setContact_mobilephone(String contact_mobilephone) {
		this.contact_mobilephone = contact_mobilephone;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_telephone() {
		return contact_telephone;
	}
	public void setContact_telephone(String contact_telephone) {
		this.contact_telephone = contact_telephone;
	}
	public String getDeliver_address() {
		return deliver_address;
	}
	public void setDeliver_address(String deliver_address) {
		this.deliver_address = deliver_address;
	}
	public String getReturn_address() {
		return return_address;
	}
	public void setReturn_address(String return_address) {
		this.return_address = return_address;
	}
	public String getReturn_contact_mobilephone() {
		return return_contact_mobilephone;
	}
	public void setReturn_contact_mobilephone(String return_contact_mobilephone) {
		this.return_contact_mobilephone = return_contact_mobilephone;
	}
	public String getReturn_contact_name() {
		return return_contact_name;
	}
	public void setReturn_contact_name(String return_contact_name) {
		this.return_contact_name = return_contact_name;
	}
	public String getReturn_contact_telephone() {
		return return_contact_telephone;
	}
	public void setReturn_contact_telephone(String return_contact_telephone) {
		this.return_contact_telephone = return_contact_telephone;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public String getWarehouse_name() {
		return warehouse_name;
	}
	public void setWarehouse_name(String warehouse_name) {
		this.warehouse_name = warehouse_name;
	}
}