package com.staylward.neuralnetworks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NeuralNetworksApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeuralNetworksApplication.class, args);
	}

}
