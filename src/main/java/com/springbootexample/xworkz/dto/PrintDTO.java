package com.springbootexample.xworkz.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@ToString
@Slf4j
public class PrintDTO {

	private Integer id;
	private String from;
	private String message;
	public PrintDTO() {
		log.info(this.getClass().getSimpleName() + " is created");
	}
	
	
	
	
	
	
}
