package com.java.spring.aws.cicd.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/salesorders")
public class SalesorderServiceApplication {

	@Autowired
	private SalesOrderRepository repository;
	
	@GetMapping
	public List<SalesOrder> getListOfOrders() {
		return repository.getSalesOrder();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SalesorderServiceApplication.class, args);
	}

}
