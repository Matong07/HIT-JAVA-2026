package test1;

/**
 * 
 * @author Ma Thế Quyền - MSV: 2021603162
 *
 */

import java.util.*;

//Danh mục sản phẩm
public abstract class Category1 {

	// contants
	public static final String CATEGORY_NAME = "No Category";
	
	// Properties
	public String category_name;// Tên danh mục

	public Category1() {
		this(Category1.CATEGORY_NAME);
	}

	public Category1(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	@Override
	public String toString() {
		return "Category [CN=" + category_name + "\n ]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
