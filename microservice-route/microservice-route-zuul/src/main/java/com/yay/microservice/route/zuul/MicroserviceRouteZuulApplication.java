package com.yay.microservice.route.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceRouteZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRouteZuulApplication.class, args);
	}
}
