package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.dao.CustomerRepository;
import com.example.entity.Customer;

@Component
public class cmdLineRnr implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void run(String... arg0) throws Exception {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("bmc");
		customer.setContactNo("+91-22-8943367");
		customer.setAddress("L.M Road, Borivali West");
		customerRepository.save(customer);
	}
}
