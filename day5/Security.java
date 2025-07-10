package com.example.springbootfirst.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Security {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").permitAll()
                        .requestMatchers("/employees", "/employee").authenticated()
                )
                .csrf(csrf -> csrf.disable())
                .httpBasic(httpBasic -> {}); // enables basic auth

        return http.build();
    }
}
