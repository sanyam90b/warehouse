package com.api.warehouse.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "inventory")
@AllArgsConstructor
public class InventoryEntity {
	
	@Id
	String art_id;
	
	String name;
	
	String stock;

	public String getArt_id() {
		return art_id;
	}

	public void setArt_id(String art_id) {
		this.art_id = art_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}
	
	
	

}
