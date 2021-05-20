package com.api.warehouse.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.api.warehouse.app.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
	
	void deleteByName(String name);

}
