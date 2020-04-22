package com.assignment.contact.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.assignment.contact.entity.contacts;
import com.assignment.contact.service.contactService;

@Controller
public class contactController {
	@Autowired
	private contactService contactServ;
	Logger logger = LoggerFactory.getLogger(contactController.class);

	@RequestMapping("/")
	public String home() {
		logger.info("home page rquest");
		return "home";
	}

	@RequestMapping("/show_addcontact")
	public String showAddContactForm() {
		logger.info("add contact page rquest");
		return "add_contact";

	}

	@RequestMapping(value = "/addcontact")
	public ModelAndView addContact(contacts contact) {
		logger.info("add contact request",contact);
		ModelAndView mv = contactServ.addContact(contact);
		return mv;
	}

	@RequestMapping(value = "/allcontacts", method = RequestMethod.GET)
	public ModelAndView getContacts() throws Exception {
		logger.info("getting all contact request");
		ModelAndView mv = contactServ.getContacts();
		return mv;
	}

	@RequestMapping(value = "/editcontact", method = RequestMethod.GET)
	public ModelAndView editContact(@RequestParam String phoneNumber) throws Exception {
		logger.info("edit contact controller",phoneNumber);
		ModelAndView mv = contactServ.editContact(phoneNumber);
		return mv;
	}

	@RequestMapping(value = "/updatecontact", method = RequestMethod.GET)
	public ModelAndView updateContact(contacts contact) throws Exception {
		logger.info("update contact request ",contact);
		ModelAndView mv = contactServ.updateContact(contact);
		return mv;
	}

	@RequestMapping(value = "/deletecontact", method = RequestMethod.GET)
	public ModelAndView deleteContact(@RequestParam String phoneNumber) throws Exception {
		logger.info("delete contact request ",phoneNumber);
		ModelAndView mv = contactServ.deleteContact(phoneNumber);
		return mv;
	}
}
