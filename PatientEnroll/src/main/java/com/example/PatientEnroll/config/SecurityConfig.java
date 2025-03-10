package com.example.PatientEnroll.config;

import java.util.List;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter
{




@Override
protected void configure(HttpSecurity http) throws Exception {
CorsConfiguration corsConfiguration = new CorsConfiguration();
corsConfiguration.setAllowedHeaders(List.of("Authorization", "Cache-Control", "Content-Type"));
corsConfiguration.setAllowedOriginPatterns(List.of("*"));
corsConfiguration.setAllowedMethods(List.of("GET", "POST", "PUT", "DELETE", "PUT","OPTIONS","PATCH", "DELETE"));
corsConfiguration.setAllowCredentials(true);
corsConfiguration.setExposedHeaders(List.of("Authorization"));

// You can customize the following part based on your project, it's only a sample
http.authorizeRequests().antMatchers("/**").permitAll().anyRequest()
.authenticated().and().csrf().disable().cors().configurationSource(request -> corsConfiguration);



}
}
