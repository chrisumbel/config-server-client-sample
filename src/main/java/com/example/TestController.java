package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@EnableAutoConfiguration
public class TestController {
	@Autowired MyBean myBean;
	
    @RequestMapping()    
    @ResponseBody
    String home() {
        return "Hello !" + myBean.getFoo();
    }
}