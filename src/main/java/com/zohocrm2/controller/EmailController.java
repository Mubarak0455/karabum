package com.zohocrm2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm2.util.EmailService;

@Controller
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/composeEmail")
	public String sendOneEmail(@RequestParam("email") String email,Model model) {
		model.addAttribute("eml", email);
		
		return"compose_email";
	}
	
	@RequestMapping("/compose")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("sub") String sub,@RequestParam("msg") String msg,Model model ) {
		emailService.sendEmail(to,sub,msg);
		model.addAttribute("mms", "email sent");
		return"compose_email";
	}
	
}
