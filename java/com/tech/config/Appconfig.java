package com.tech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class Appconfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver ivr = new InternalResourceViewResolver();
		ivr.setSuffix(".jsp");
		return ivr;
	}

	@Bean
	public DriverManagerDataSource dmds() {
		DriverManagerDataSource d = new DriverManagerDataSource();
		d.setDriverClassName("com.mysql.jdbc.Driver");
		d.setUrl("jdbc:mysql://localhost:3306/springmvcbn10");
		d.setUsername("root");
		d.setPassword("Root");
		return d;
	}
	
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean lb= new LocalSessionFactoryBean();
		lb.setDataSource(null);
	}
}
