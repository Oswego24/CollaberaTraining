package com.collabera.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.collabera.mysql.model.Customer;
import com.collabera.mysql.repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo repo;
	
	@GetMapping("/api/customer")
	public List<Customer> getAllCustomers(){
		return repo.findAll();
	}
	
	public Customer getCustomer(Long id) {
		Optional<Customer> found = repo.findById(id);
			
		if(found.isPresent()) {
			return found.get();
		}else {
			return new Customer();
		}
	}
	
	public void addCustomer(Customer customer) {
		
		boolean foundCustomer = repo.findAll()
				.stream().anyMatch(c -> c.getId() == customer.getId());
		if(!foundCustomer) {
			repo.save(customer);
			
		}
	}
	
	public void updateCustomer(Customer customer) {
		Optional<Customer> optToUpdate = repo.findById(customer.getId());
		
		if(optToUpdate.isPresent()) {
			Customer toUpdate = optToUpdate.get();
			toUpdate.setFirstName(customer.getFirstName());
			toUpdate.setLastName(customer.getLastName());
			toUpdate.setPin(customer.getPin());
			
			repo.save(toUpdate);
		}else {
			System.out.println("Not updated");
		}
	}
	
	public void updatePartOfCustomer(Customer customer, Long id) {
		Customer custToUpdate = getCustomer(id);
		
		if(custToUpdate.getId() != -1L) {
			custToUpdate.setPin(customer.getPin());
			repo.save(custToUpdate);
		}
	}
}
