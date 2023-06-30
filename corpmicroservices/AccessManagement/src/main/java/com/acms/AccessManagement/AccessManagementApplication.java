package com.acms.AccessManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:6000")
public class AccessManagementApplication {

	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(AccessManagementApplication.class, args);
	}
	@Bean
	public RestTemplate geTemplate()
	{
		return new RestTemplate();
	}

}
