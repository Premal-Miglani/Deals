package com.DealsFinder.Deals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DealsFinder.Deals.model.Deals;
import com.DealsFinder.Deals.repository.DealRepo;

@Service
public class DealsUserService {
	
	@Autowired
	private DealRepo dealsRepo;

	//Get all deals
	public List<Deals> getAllDeals() {
		return dealsRepo.findAll();
	}
	
	// Get deals by item
	public Deals getDealByItem(String item) {
		return dealsRepo.findById(item).get();
	}

}
