package com.lern.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;
import org.springframework.security.web.server.SecurityWebFilterChain;

public class SecurityConfig {
	
	@Value("${spring.security.oauth2.resourceserver.jwt.issuer-uri}")
	String issuerUri;

  @Bean
  SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
    http
        .authorizeExchange()
          //.pathMatchers("/resource")
            //.hasAuthority("SCOPE_resource.read")
          .anyExchange()
            .authenticated()
          .and()
        .oauth2ResourceServer()
          .jwt().jwtDecoder((ReactiveJwtDecoder) jwtDecoder());
    return http.build();
  }
  
  @Bean
	public JwtDecoder jwtDecoder() {
		return JwtDecoders.fromIssuerLocation(issuerUri);
	}
}
