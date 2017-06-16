package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyBean {
	
    private String foo;
    
    public String getFoo() {
    	return this.foo;
    }
    
    @Value("${starplatform.foo}")
    public void setFoo(String foo) {
    	this.foo = foo;
    } 
}