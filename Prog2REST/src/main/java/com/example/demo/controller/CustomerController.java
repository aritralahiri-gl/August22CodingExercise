package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CustomerRepo;

import com.example.demo.model.Customer;

@RestController	
public class CustomerController {

	@Autowired
	CustomerRepo repo;

	@GetMapping("/")
	public List<Customer> getCustomers()

	{

		return repo.findAll();

	}

	@PostMapping(path = "/add", consumes = { "application/json" })
	public Customer addCustomers(@RequestBody Customer cust)

	{

		repo.save(cust);

		return cust;

	}

	@PutMapping("/update")

	public Customer saveOrUpdateCustomer(@RequestBody Customer customer)

	{

		repo.save(customer);

		return customer;

	}

	@DeleteMapping("/cust/${cid}")
	public String deleteCustomer(@PathVariable int cid)

	{

		Customer a = repo.findById(cid).orElse(new Customer());

		repo.delete(a);

		return "deleted";

	}

}
