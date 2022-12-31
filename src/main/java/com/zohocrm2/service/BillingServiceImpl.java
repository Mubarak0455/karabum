package com.zohocrm2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm2.entity.Billing;
import com.zohocrm2.repository.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billRepo;
	
	@Override
	public void saveOneBill(Billing bill) {
		billRepo.save(bill);
	}

	@Override
	public List<Billing> listBills() {
		List<Billing> bills = billRepo.findAll();
		
		return bills;
	}

}
