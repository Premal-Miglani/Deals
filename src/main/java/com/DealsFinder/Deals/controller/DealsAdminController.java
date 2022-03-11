package com.DealsFinder.Deals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.DealsFinder.Deals.model.Deals;
import com.DealsFinder.Deals.service.DealsAdminService;

@RestController
public class DealsAdminController {
	
	@Autowired
	DealsAdminService dealsAdminserv;
	
	// Welcome page
	@GetMapping("/")
	public String welcome() {
		return "Welcome to the Deals & Coupons Finder!!!";
	}
	
	// Welcome admin page
	@GetMapping("/admin")
	public String admin() {
		return "Welcome Admin in Deals & Coupons!!";
	}
	
	// Get all deals
	@GetMapping("/admin/deal")
	public List<Deals> getAllDeals() {
		System.out.println("Get all deals");
		return dealsAdminserv.getAllDeals();
	}
	
	// Get deals by id
	@GetMapping("/admin/deal/{item}")
	public Deals getDealsByItem(@PathVariable String item) {
		System.out.println("Gel deal | Admin");
		return dealsAdminserv.getDealsByItem(item);	
	}
	
	// Add deal
	@RequestMapping(method=RequestMethod.POST,value="/admin/dealadd")
	public void addDeal(@RequestBody Deals deal)
	{
		dealsAdminserv.addDeal(deal);
	}
	
	
	//udpate deal
	@RequestMapping(method=RequestMethod.PUT,value="/admin/update/{id}")
	public void updatedeal(@RequestBody Deals deal,@PathVariable String id)
	{
		dealsAdminserv.updatedeal(id,deal);
	}
	
	// delete deal by id
	@RequestMapping("/delete/{id}")
	public String deleteDeal(@PathVariable("id") String id) {
		System.out.println("Deal is deleteded by Admin");
		dealsAdminserv.deleteDeal(id);
		return "redirect:/";
	}
	
	

}
