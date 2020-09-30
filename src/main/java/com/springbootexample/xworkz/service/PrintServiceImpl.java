package com.springbootexample.xworkz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.xworkz.dto.PrintDTO;
import com.springbootexample.xworkz.entity.PrintEntity;
import com.springbootexample.xworkz.repository.PrintRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PrintServiceImpl implements PrintService {

	@Autowired
	private PrintRepo printrepository;

	public PrintServiceImpl() {
		log.info(this.getClass().getSimpleName() + "  created");
	}

	@Override
	public PrintDTO savethedetails(PrintDTO printdto) {
		log.info(this.getClass().getSimpleName()+"is created");
		try {
			PrintEntity printentity = new PrintEntity();
			printentity.setFrom(printdto.getFrom());
			printentity.setMessage(printdto.getMessage());
			printentity = printrepository.save(printentity);
			if (printentity.getId() != null) {
				printdto.setId(printentity.getId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return printdto;
	}

}
