package com.springbootexample.xworkz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


import com.springbootexample.xworkz.entity.PrintEntity;

@Repository
@EnableJpaRepositories(basePackages="com.springbootexample.xworkz")
public interface PrintRepo extends JpaRepository<PrintEntity, Integer>{

	

}
