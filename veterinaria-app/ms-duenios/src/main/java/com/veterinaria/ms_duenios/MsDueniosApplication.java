package com.veterinaria.ms_duenios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class MsDueniosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsDueniosApplication.class, args);
	}

}
