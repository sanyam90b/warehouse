package com.api.warehouse.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.warehouse.app.model.Inventories;
import com.api.warehouse.app.model.Products;
import com.api.warehouse.app.services.InventoryService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping
	public Products getArticle() {
		
		return inventoryService.getArticle();
	}
	
	@GetMapping
	@RequestMapping("/inventory")
	public Inventories getInventory() {
		
		return inventoryService.getInventory();
	}
	
	@DeleteMapping(value = "/{name}")
	public Products deleteMapping(@PathVariable(value = "name") String name) {
		return inventoryService.deleteProduct(name);
		
	}
	
	
	

}
