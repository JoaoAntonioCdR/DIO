package com.design_patterns.projeto_design_patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDesignPatternsApplication.class, args);
	}

}
