package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm2.entity.Contact;
import com.zohocrm2.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listcontacts")
	public String listContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return"list_contacts";
	}
	
	@RequestMapping("/createbill")
	public String createBill(@RequestParam("id") long id,Model model) {
		Contact contact = contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return"billing_bill";
	}
}
