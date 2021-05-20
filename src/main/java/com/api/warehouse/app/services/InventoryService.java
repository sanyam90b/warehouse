package com.api.warehouse.app.services;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.warehouse.app.entities.Article;
import com.api.warehouse.app.model.Inventories;
import com.api.warehouse.app.model.Product;
import com.api.warehouse.app.model.Products;
import com.api.warehouse.app.repository.ArticleRepository;
import com.api.warehouse.app.repository.InventoryRepository;
import com.api.warehouse.app.repository.ProductRepository;

@Service
public class InventoryService {

	@Autowired
	ArticleRepository articleRepository;

	@Autowired
	InventoryRepository inventoryRepository;

	@Autowired
	ProductRepository productRepository;

	public Products getArticle() {

		return new Products(articleRepository.findAll().stream().collect(Collectors.groupingBy(Article::getName))
				.entrySet().stream().map(article -> new Product(article.getKey(), article.getValue()))
				.collect(Collectors.toList()));

	}

	public Inventories getInventory() {

		return new Inventories(inventoryRepository.findAll());
	}

	@Transactional
	public Products deleteProduct(String name) {
		System.out.println("XXXXX: " + name);
		articleRepository.deleteByName(name);

		return getArticle();
	}

}
