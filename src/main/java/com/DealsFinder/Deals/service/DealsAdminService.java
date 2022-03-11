package com.DealsFinder.Deals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DealsFinder.Deals.model.Deals;
import com.DealsFinder.Deals.repository.DealRepo;

@Service
public class DealsAdminService {
	
	@Autowired
	private DealRepo dealsRepo;
	
	// Get all deals
	public List<Deals> getAllDeals() {
		return dealsRepo.findAll();
	}
	
	// Get deals by item
	public Deals getDealsByItem(String item) {
		return dealsRepo.findById(item).get();
	}
	
	// Add deal
	public void addDeal(Deals deal) {
		dealsRepo.save(deal);
		
	}
	
	//Update deal
	public void updatedeal(String id, Deals deal) {
		dealsRepo.save(deal);
			
	}


	// Delete deals by id
	public void deleteDeal(String id) {
		dealsRepo.deleteById(id);
		
	}
	
	

	
	
}
