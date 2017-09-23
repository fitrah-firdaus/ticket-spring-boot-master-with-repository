package com.smk.bi.ticketing;

import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository){
		return (args) -> {
			Customer customer = new Customer();
			customer.setCustomerName("SMK");
			customer.setCustomerPhoneNumber("123");
			customer.setCustomerAddress("BINTARO");
			customerRepository.save(customer);
		};
	}
}
