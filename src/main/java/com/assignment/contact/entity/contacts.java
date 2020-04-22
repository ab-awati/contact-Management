package com.assignment.contact.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class contacts {

	/*
	 * @GeneratedValue(strategy = GenerationType.AUTO) private int id;
	 */
@NotBlank(message = "firstName is mandatory")
private String firstName;
@NotBlank(message = "lastName is mandatory")
private String lastName;
@NotBlank(message = "emailId is mandatory")
private String emailId;
@Id
@NotBlank(message = "phoneNumber is mandatory")
private String phoneNumber;
@NotBlank(message = "contactStatus is mandatory")
private String contactStatus;

	/*
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 */
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getContactStatus() {
	return contactStatus;
}
public void setContactStatus(String contactStatus) {
	this.contactStatus = contactStatus;
}
@Override
public String toString() {
	return "contacts [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
			+ ", phoneNumber=" + phoneNumber + ", contactStatus=" + contactStatus + "]";
}



}
