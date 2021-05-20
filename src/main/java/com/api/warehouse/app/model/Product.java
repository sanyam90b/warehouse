package com.api.warehouse.app.model;

import java.util.List;

import com.api.warehouse.app.entities.Article;

public class Product {

	String name;
	List<Article> contain_articles;

	public Product(String name, List<Article> contain_articles) {
		super();
		this.name = name;
		this.contain_articles = contain_articles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Article> getContain_articles() {
		return contain_articles;
	}

	public void setContain_articles(List<Article> contain_articles) {
		this.contain_articles = contain_articles;
	}

}
