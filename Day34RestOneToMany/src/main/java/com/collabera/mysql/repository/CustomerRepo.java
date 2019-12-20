package com.collabera.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
	void save(Customer customer, Long id);
}
