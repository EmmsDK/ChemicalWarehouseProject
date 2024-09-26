package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChemicalWarehouseProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChemicalWarehouseProjectApplication.class, args);
	}


	/*
		FOR AT TESTE IN MEMORY DATABASEN:
		Open your browser and navigate to http://localhost:8080/h2-console.
		Use the following settings:
		JDBC URL: jdbc:h2:mem:testdb
		User Name: sa
		Password: password
		Click on "Connect".
	 */
}
