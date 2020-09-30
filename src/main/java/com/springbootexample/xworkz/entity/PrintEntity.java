package com.springbootexample.xworkz.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
@Entity
@Table(name="xworkz")
public class PrintEntity  implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GenericGenerator(name = "Xworkz", strategy = "increment")
	@GeneratedValue(generator = "Xworkz")
	private Integer id ;
	@Column(name="from_name")
	private String from;
	@Column(name="message_table")
	private String message;
	
	public PrintEntity(){
		log.info(this.getClass().getSimpleName()+"created entity ");
	}
	
	
	
}
