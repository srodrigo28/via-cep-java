package com.treina.consultacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsultaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsultaCepApplication.class, args);
	}

}
