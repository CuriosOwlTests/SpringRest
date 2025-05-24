package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class SimpleRestSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestSpringApplication.class, args);
	}

	@GetMapping("/")
	public Mono<String> healthCheck() {
		return Mono.just("ok");
	}
}
