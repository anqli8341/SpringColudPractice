package com.springcloud.eurekaserver.config;



import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author anquan li
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected  void configure(HttpSecurity httpSecurity) throws  Exception{
    super.configure(httpSecurity);
    httpSecurity.csrf().disable();
  }
}
