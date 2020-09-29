package com.springbootexample.xworkz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootexample.xworkz.dto.PrintDTO;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MessageController {
		@PostMapping("/postmsg")
		public String postMessage(PrintDTO printDTO, Model model) {
			log.info("invoking postMessage()");
			model.addAttribute("messagetext", printDTO.getMessage());
			model.addAttribute("from", printDTO.getFrom());
			return "Success";
		}
	}
	
	
	
	
	
	

