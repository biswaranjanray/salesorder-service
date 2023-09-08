package com.java.spring.aws.cicd.example;

public class SalesOrder {

	private int id;
	private String productName;
	private int quantity;
	private long cost;
	
	public SalesOrder(int id, String productName, int quantity, long cost) {
		this.id = id;
		this.productName = productName;
		this.quantity = quantity;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "SalesOrder [id=" + id + ", productName=" + productName + ", quantity=" + quantity + ", cost=" + cost
				+ "]";
	}
	
}
