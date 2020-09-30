package com.springbootexample.xworkz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootexample.xworkz.dto.PrintDTO;
import com.springbootexample.xworkz.entity.PrintEntity;

@Repository
public interface PrintRepo extends  CrudRepository<PrintEntity, Integer>{

	PrintEntity save(PrintDTO printdto);

}
