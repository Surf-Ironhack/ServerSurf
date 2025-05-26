package com.Surf.server_surf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerSurfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerSurfApplication.class, args);
	}

}
