package com.api.warehouse.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.warehouse.app.entities.InventoryEntity;

public interface InventoryRepository  extends JpaRepository<InventoryEntity, String>{

}
