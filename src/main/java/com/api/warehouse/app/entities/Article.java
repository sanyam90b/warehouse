package com.api.warehouse.app.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contain_articles")
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	@Id
	String id;
	String art_id;
	String amount_of;
	String name;
	
	
	public String getArt_id() {
		return art_id;
	}
	public void setArt_id(String art_id) {
		this.art_id = art_id;
	}
	public String getAmount_of() {
		return amount_of;
	}
	public void setAmount_of(String amount_of) {
		this.amount_of = amount_of;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
