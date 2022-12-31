package com.zohocrm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm2.entity.Billing;
import com.zohocrm2.service.BillingService;

@Controller
public class BillingController {

	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/saveBill")
	public String createBill(Billing bill) {
		billingService.saveOneBill(bill);
		return"create_lead";
	}
	@RequestMapping("/listBills")
	public String getAllBills(Model model) {
		 List<Billing> bill = billingService.listBills();
		model.addAttribute("bill", bill);
		return "list_bills";
	}
}