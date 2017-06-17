package com.example.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
	public Customer findById(@PathVariable("id") int customerId) {
		return customerService.getCustomerById(customerId);
	}

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public Collection<Customer> findAll() {
		return customerService.findAll();
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.POST)
	public void add(@RequestBody Customer customer) {
		customerService.add(customer);
	}

	@RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
	public void update(@RequestBody Customer customer) {
		customerService.update(customer);
	}
}
