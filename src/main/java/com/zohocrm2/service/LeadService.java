package com.zohocrm2.service;

import java.util.List;

import com.zohocrm2.entity.Lead;


public interface LeadService {

	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLead(long id);

	public List<Lead> getAllLeads();

}
