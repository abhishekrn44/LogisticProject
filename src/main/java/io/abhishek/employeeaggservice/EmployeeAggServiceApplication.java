package io.abhishek.employeeaggservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("io.abhishek")
public class EmployeeAggServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAggServiceApplication.class, args);
	}
	
  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
  
}
