package com.securityapp.main.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
		
		//auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select username from users where username=?");
		
		auth.inMemoryAuthentication().withUser("bill").password("bill").roles("USER");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		//Allows access to the three locations specified, but requires authentication for all others
		http.httpBasic().and().authorizeRequests().antMatchers("/", "/index.html", "/public/**").permitAll().anyRequest().authenticated();
		
		//Disable csrf
		http.csrf().disable();
	}
	
}
