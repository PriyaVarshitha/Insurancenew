package com.health.insuranceview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.health.insuranceview") // Adjust the package name accordingly
public class InsuranceviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsuranceviewApplication.class, args);
	}

}
