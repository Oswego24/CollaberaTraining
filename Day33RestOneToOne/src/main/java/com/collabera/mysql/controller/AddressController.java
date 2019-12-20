package com.collabera.mysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Address;
import com.collabera.mysql.repository.AddressRepo;

@RestController
public class AddressController {

	@Autowired
	AddressRepo service;
	
	@GetMapping("/api/address")
	public List<Address> getAllAddresses(){
		return service.findAll();
	}
	
	@GetMapping("/api/address/{addressid}")
	public Address getAddress(@PathVariable Long addressid) {
		
		Optional<Address> found = service.findById(addressid);
		
		if(found.isPresent()) {
			return found.get();
		}else {
			return new Address();
		}
		
	}
	
	@PostMapping("/api/addaddress")
	public void addAddress(@RequestBody Address address) {
		service.save(address);
	}
}
