package com.api.warehouse.app.model;

import java.util.List;

public class Products {
	
	List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Products(List<Product> products) {
		super();
		this.products = products;
	}
	
	

}
