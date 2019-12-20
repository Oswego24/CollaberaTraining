//package com.collabera.mysql.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.collabera.mysql.model.Account;
//import com.collabera.mysql.repository.AccountRepo;
//
//@RestController
//public class AccountController {
//
//	@Autowired
//	AccountRepo service;
//	
//	@GetMapping("/api/account")
//	public List<Account> getAccounts(){
//		return service.findAll();
//	}
//	
//	@GetMapping("/api/account/{accountid}")
//	public Account getAccount(@PathVariable Long accountid) {
//		Optional<Account> found = service.findById(accountid);
//		
//		if(found.isPresent()) {
//			return found.get();
//		}else {
//			return new Account();
//		}
//	}
//	
//	@PostMapping
//	public void addAccount(@RequestBody Account account) {
//		
//		boolean foundAccount = false;
//		
//		service.findAll().stream().anyMatch(c -> c.getId() == account.getId());
//		if(!foundAccount) {
//			service.save(account);
//		}
//	}
//}
