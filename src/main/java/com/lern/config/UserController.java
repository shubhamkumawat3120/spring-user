package com.lern.config;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class UserController {
	
	@GetMapping("/test")
	public Mono<String> getTest(){
		return Mono.just("User-service is runing fine!");
	}
	
	@GetMapping("/tests")
	public String getTests(){
		return "User-service is runing fine!";
	}
	

}
