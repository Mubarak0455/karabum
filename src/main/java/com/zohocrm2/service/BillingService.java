package com.zohocrm2.service;

import java.util.List;

import com.zohocrm2.entity.Billing;

public interface BillingService {

	void saveOneBill(Billing bill);

	List<Billing> listBills();

}
