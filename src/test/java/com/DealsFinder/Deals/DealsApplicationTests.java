package com.DealsFinder.Deals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.DealsFinder.Deals.model.Deals;
import com.DealsFinder.Deals.repository.DealRepo;

@SpringBootTest
class DealsApplicationTests {

	@Autowired
	DealRepo dealRepo;
	
	public void testCreate() {
		Deals d = new Deals();
		d.setId("151");
		d.setItem("Books");
		d.setDeal("Get 50% off on any comic books");
		dealRepo.save(d);
		assertNotNull(dealRepo.findById("151").get());
	}
	
	@Test
	public void testGetAllDeals() {
		List<Deals> l = dealRepo.findAll();
		assertThat(l).size().isGreaterThan(0);
	}
	
//	@Test
//	public void testSingleDeals() {
//		Deals deals=dealRepo.findById("151").get();
//		assertEquals("Get 50% off on any comic books",deals.getDeal());
//	}
//	

//	@Test
//	public void testUpdate() {
//	
//		Deals d = dealRepo.findById("151").get();
//		d.setItem("Dress");
//		dealRepo.save(d);
//		assertNotEquals("Books",dealRepo.findById("151").get().getItem());
//	}
}
