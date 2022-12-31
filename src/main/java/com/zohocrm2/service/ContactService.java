package com.zohocrm2.service;

import java.util.List;

import com.zohocrm2.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);

	List<Contact> getAllContacts();

	Contact getOneContact(long id);

	
	
	
}
