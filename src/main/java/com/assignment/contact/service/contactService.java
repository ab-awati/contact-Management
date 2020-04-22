package com.assignment.contact.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;


import com.assignment.contact.entity.contacts;
import com.assignment.contact.repository.contactRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class contactService {
	Logger logger = LoggerFactory.getLogger(contactService.class);
	@Autowired
	contactRepository contactRepo;

	public ModelAndView getContacts() throws Exception {
		logger.debug("getContacts service method called");
		ModelAndView mv = new ModelAndView("view_contact");
		List<contacts> contactList = contactRepo.findAll();
		ObjectMapper mapper = new ObjectMapper();
		String jsonObject = mapper.writeValueAsString(contactList);
		System.out.println("contactList>>>>>>" + jsonObject);
		mv.addObject("contact", jsonObject);
		return mv;
	}

	public ModelAndView editContact(String pNum) throws Exception {
		logger.debug("editContact service method called",pNum);
		String phoneNum = pNum.trim();
		System.out.println("phoneNum" + phoneNum);
		contacts contact = contactRepo.findByphoneNumber(phoneNum);
		ModelAndView mv;
		if (null == contact || contact.equals("")) {
			mv = new ModelAndView("error_display");
			mv.addObject("status", "Error:Enetered record " + phoneNum + " Not present in database");
		} else {
			mv = new ModelAndView("edit_contact");
			ObjectMapper mapper = new ObjectMapper();
			String jsonObject = mapper.writeValueAsString(contact);
			System.out.println("contactList>>>>>>" + jsonObject);
			mv.addObject("contact", jsonObject);
		}
		return mv;
	}

	@Transactional
	public ModelAndView addContact(contacts contact) {
		logger.debug("addContact service method called",contact);
		boolean result = contactRepo.existsById(contact.getPhoneNumber());
		ModelAndView mv;
		if (result) {
			mv = new ModelAndView("add_contact");
			mv.addObject("status", "Error:Record with mobile Number " + contact.getPhoneNumber() + " is already exist");
		} else {
			contactRepo.save(contact);
			mv = new ModelAndView("add_contact");
			mv.addObject("status", "Last Record Successfully saved");
		}
		return mv;

	}

	@Transactional
	public ModelAndView updateContact(contacts contact) throws Exception {
		logger.debug("updateContact service method called",contact);
		boolean result = contactRepo.existsById(contact.getPhoneNumber());
		ModelAndView mv = new ModelAndView("home");
		if (result) {
			contactRepo.deleteById(contact.getPhoneNumber());
			contactRepo.save(contact);
			mv.addObject("status", "Record for mobile number " + contact.getPhoneNumber() + " is updated successfully");
		} else {
			contactRepo.save(contact);
			mv = new ModelAndView("home");
			mv.addObject("status", "New record with mobile Number " + contact.getPhoneNumber() + " Successfully saved");
		}
		return mv;
	}

	@Transactional
	public ModelAndView deleteContact(String phoneNumber) {
		logger.debug("deleteContact service method called",phoneNumber);
		String phoneNum = phoneNumber.trim();
		boolean result = contactRepo.existsById(phoneNum);
		ModelAndView mv;
		if (result) {
			mv = new ModelAndView("home");
			;
			contactRepo.deleteById(phoneNumber);
			mv.addObject("status", "Record for mobile number " + phoneNumber + " is Deleted successfully");
		} else {
			mv = new ModelAndView("error_display");
			mv.addObject("status", "Error:Enetered record " + phoneNumber + " Not present in database");
		}
		return mv;
	}

}
