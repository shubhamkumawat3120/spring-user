package com.lern.config;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class UserController {
	
	@GetMapping("/test")
	public Mono<String> getTest() {
		return Mono.just("User-service is runing fine!");
	}

	@GetMapping("/user")
	public Mono<Jwt> resource(@AuthenticationPrincipal Jwt jwt) {
		return Mono.just(jwt);
	}

}
