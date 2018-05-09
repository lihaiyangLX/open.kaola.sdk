package com.kaola.base;

/**
 * 类目信息
 * @author LiHaiyang
 * 2018年3月19日
 */
public class Category {

	private Long category_id; // 类目id
	
	private int category_level; // 类目所在层级，目前一级类目为2，二级类目为3，依此类推

	private String category_name; // 类目名称
	
	private int is_leaf; // 是否末级类目, 1:末级类目 0:非末级类目

	private Long parent_id; // 父目录id

	public void setIs_leaf(int is_leaf) {
		this.is_leaf = is_leaf;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Long getParent_id() {
		return parent_id;
	}

	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}

	public int getCategory_level() {
		return category_level;
	}

	public void setCategory_level(int category_level) {
		this.category_level = category_level;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public int getIs_leaf() {
		return is_leaf;
	}
}