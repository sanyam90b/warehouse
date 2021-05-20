package com.api.warehouse.app.model;

import java.util.List;

import com.api.warehouse.app.entities.InventoryEntity;

public class Inventories {

	List<InventoryEntity> inventories;

	public List<InventoryEntity> getInventories() {
		return inventories;
	}

	public void setInventories(List<InventoryEntity> inventories) {
		this.inventories = inventories;
	}

	public Inventories(List<InventoryEntity> inventories) {
		super();
		this.inventories = inventories;
	}

}
