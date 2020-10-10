package com.springbootexample.xworkz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootexample.xworkz.dto.PrintDTO;
import com.springbootexample.xworkz.service.PrintServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MessageController {

	@Autowired
	private PrintServiceImpl printserviceimpl;

	@PostMapping("/postmsg")
	public String postMessage(PrintDTO printdto, Model model) {
		log.info("invoking postMessage()");
		try {
			printdto = printserviceimpl.savethedetails(printdto);
			if (printdto.getId() != null) {
				model.addAttribute("id", printdto.getId());
				model.addAttribute("messagetext", printdto.getMessage());
				model.addAttribute("from", printdto.getFrom());
				return "Success";

			} else {
				log.info("data is invalid");
				model.addAttribute("errorMessage", "data is not getting saved ");
				return "index";
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return "index";
	}
	@GetMapping("/redirect")
	public String ShowAppinfo(Model model) {
		return "appInfo";
	}
}
