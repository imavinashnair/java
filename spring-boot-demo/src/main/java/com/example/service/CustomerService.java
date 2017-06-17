package com.example.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CustomerRepository;
import com.example.entity.Customer;

@Service
public class CustomerService {

	StringBuilder b;

	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomerById(int id) {
		return customerRepository.findOne(id);
	}

	public Collection<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void add(Customer customer) {
		customerRepository.save(customer);
	}

	public void update(Customer customer) {
		customerRepository.save(customer);
	}
}
