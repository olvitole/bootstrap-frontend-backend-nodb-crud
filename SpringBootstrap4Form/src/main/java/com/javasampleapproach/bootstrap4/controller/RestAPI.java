package com.javasampleapproach.bootstrap4.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.bootstrap4.model.Customer;
 
 
@RestController
@RequestMapping("/api/customer")
public class RestAPI {
 
	@PostMapping(value = "/save")
	public String postCustomer(@RequestBody Customer customer) {
		
		String fullName = customer.getFirstname() + " " + customer.getLastname();
		
		return "Hello " + fullName + "!" + " (Message from SpringBoot Server)";
	}
}