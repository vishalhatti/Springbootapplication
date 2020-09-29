package com.springbootexample.xworkz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class Resolver {
    @RequestMapping("/")
	public static String indexpage() {
		log.info("invoked index page");
		return "index";
	}
	
	
	
}
