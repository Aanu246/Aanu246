package com.example.ProjectConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"com.example.implemetation","com.example.services"})
//@EnableAspectJAutoProxy
public class ProjectConfiguration {
	
	

}
