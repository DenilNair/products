package com.denil.products.ProductsList.controller;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Products {
int cost;
String productName;
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
public Products(int cost, String productName) {
	super();
	this.cost = cost;
	this.productName = productName;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
}
