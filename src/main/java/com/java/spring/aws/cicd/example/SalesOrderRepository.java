package com.java.spring.aws.cicd.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class SalesOrderRepository {

	public List<SalesOrder> getSalesOrder() {
		return Stream.of(
				new SalesOrder(100, "Monitor", 2, 20000),
				new SalesOrder(100, "Mouse", 2, 1500),
				new SalesOrder(100, "Keyboard", 2, 3000)
				).collect(Collectors.toList());
	}
}
