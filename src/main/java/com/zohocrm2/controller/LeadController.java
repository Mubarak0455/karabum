package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm2.entity.Contact;
import com.zohocrm2.entity.Lead;
import com.zohocrm2.service.ContactService;
import com.zohocrm2.service.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
	
	@RequestMapping("/create")
	public String viewOneForm() {
		return"create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(Lead lead,Model model) {
		leadService.saveOneLead(lead);
		
		model.addAttribute("lead", lead);
		return"lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertOneLead(@RequestParam("id") long id,Model model ) {
		Lead lead = leadService.getOneLead(id);
		Contact contact = new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.saveContact(contact);
		leadService.deleteOneLead(id);
		
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return"list_contacts";
	}
	@RequestMapping("/listleads")
	public String listLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	
	
	@RequestMapping("/leadinfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		 Lead lead = leadService.getOneLead(id);
		 model.addAttribute("lead", lead);
		return"lead_info";
	}
}
