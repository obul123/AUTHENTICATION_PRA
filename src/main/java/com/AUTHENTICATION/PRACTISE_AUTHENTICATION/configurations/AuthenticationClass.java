package com.AUTHENTICATION.PRACTISE_AUTHENTICATION.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class AuthenticationClass {

	@Bean
	public UserDetailsService getDetails() {
		UserDetails uer = User.withUsername("user1").password("user1").roles("ADMIN").build();

		UserDetails user1 = User.withUsername("u").password("u").roles("USER").build();

		return new InMemoryUserDetailsManager(uer, user1);
	} 
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception
	{
		return httpSecurity.csrf().disable()
				        .authorizeHttpRequests()
				        .requestMatchers("/authentication/one")
				        .permitAll()
				        .and()
				        .build();
	}

}
