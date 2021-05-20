package com.api.warehouse.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.warehouse.app.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, String> {

	void deleteByName(String name);

}
