package com.apigetway1.ApiGetway;

import io.netty.resolver.DefaultAddressResolverGroup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import reactor.netty.http.client.HttpClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiGetwayApplication {

	@LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(ApiGetwayApplication.class, args);
	}

	@Bean
	public HttpClient httpClient() {
		return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
	}
}
