package com.DealsFinder.Deals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "dealsCoupons")
public class Deals {
	
	@Id
	private String id;
	private String item;
	private String deal;
	
	public Deals(){
		
	}
	
	public Deals(String id, String item, String deal) {
		super();
		this.id = id;
		this.item = item;
		this.deal = deal;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDeal() {
		return deal;
	}

	public void setDeal(String deal) {
		this.deal = deal;
	}

	@Override
	public String toString() {
		return "Deals [id=" + id + ", item=" + item + ", deal=" + deal + "]";
	}
	
	
}
