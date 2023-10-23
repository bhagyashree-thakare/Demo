package com.jbk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private long productId;
	private String productname;
	private int supplierId;
	private int categoryId;
	private int productQuantity;
	private double productPrice;

	public Product(long productId, String productname, int supplierId, int categoryId, int productQuantity,
			double productPrice) {
		super();
		this.productId = productId;
		this.productname = productname;
		this.supplierId = supplierId;
		this.categoryId = categoryId;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	public Product() {
		super();
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", supplierId=" + supplierId
				+ ", categoryId=" + categoryId + ", productQuantity=" + productQuantity + ", productPrice="
				+ productPrice + "]";
	}

}
