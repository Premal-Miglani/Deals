package com.DealsFinder.Deals.repository;

import org.springframework.stereotype.Repository;

import com.DealsFinder.Deals.model.Deals;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface DealRepo extends MongoRepository<Deals, String>{

}
