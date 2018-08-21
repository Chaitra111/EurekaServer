package com.bridgelabz.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Chaitra Ankolekar
 * Purpose :Eureka Server where every microservice will register
 */
@SpringBootApplication
@EnableEurekaServer
public class ToDoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoEurekaServerApplication.class, args);
	}
}
