package com.auth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personalDetails")
public class PersonalDetails {
	
	public PersonalDetails() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String secondaryNumber;
	private String emailId;
	private String panCardNumber;
	private String aadharCardNumber;
	private String passportNumber;
	private String addressLine1;
	private String addressLine2;
	private String addressCity;
	private String addressState;
	private String addressCountry;
	private String addressPinCode;
	private String fatherFullName;
	private String motherFullName;
	private String expectedSalary;
	private String linkedInProfile;
	private boolean personalDetailsCompleteFlag;
	
	
	public Long userId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


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


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getSecondaryNumber() {
		return secondaryNumber;
	}


	public void setSecondaryNumber(String secondaryNumber) {
		this.secondaryNumber = secondaryNumber;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPanCardNumber() {
		return panCardNumber;
	}


	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}


	public String getAadharCardNumber() {
		return aadharCardNumber;
	}


	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}


	public String getPassportNumber() {
		return passportNumber;
	}


	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	public String getAddressLine1() {
		return addressLine1;
	}


	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}


	public String getAddressLine2() {
		return addressLine2;
	}


	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


	public String getAddressCity() {
		return addressCity;
	}


	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}


	public String getAddressState() {
		return addressState;
	}


	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}


	public String getAddressCountry() {
		return addressCountry;
	}


	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}


	public String getAddressPinCode() {
		return addressPinCode;
	}


	public void setAddressPinCode(String addressPinCode) {
		this.addressPinCode = addressPinCode;
	}


	public String getFatherFullName() {
		return fatherFullName;
	}


	public void setFatherFullName(String fatherFullName) {
		this.fatherFullName = fatherFullName;
	}


	public String getMotherFullName() {
		return motherFullName;
	}


	public void setMotherFullName(String motherFullName) {
		this.motherFullName = motherFullName;
	}


	public String getExpectedSalary() {
		return expectedSalary;
	}


	public void setExpectedSalary(String expectedSalary) {
		this.expectedSalary = expectedSalary;
	}


	public String getLinkedInProfile() {
		return linkedInProfile;
	}


	public void setLinkedInProfile(String linkedInProfile) {
		this.linkedInProfile = linkedInProfile;
	}


	public boolean isPersonalDetailsCompleteFlag() {
		return personalDetailsCompleteFlag;
	}


	public void setPersonalDetailsCompleteFlag(boolean personalDetailsCompleteFlag) {
		this.personalDetailsCompleteFlag = personalDetailsCompleteFlag;
	}


	public PersonalDetails(Long userId, String firstName, String lastName, String phoneNumber,
			String secondaryNumber, String emailId, String panCardNumber, String aadharCardNumber,
			String passportNumber, String addressLine1, String addressLine2, String addressCity, String addressState,
			String addressCountry, String addressPinCode, String fatherFullName, String motherFullName,
			String expectedSalary, String linkedInProfile, boolean personalDetailsCompleteFlag) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.secondaryNumber = secondaryNumber;
		this.emailId = emailId;
		this.panCardNumber = panCardNumber;
		this.aadharCardNumber = aadharCardNumber;
		this.passportNumber = passportNumber;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressCity = addressCity;
		this.addressState = addressState;
		this.addressCountry = addressCountry;
		this.addressPinCode = addressPinCode;
		this.fatherFullName = fatherFullName;
		this.motherFullName = motherFullName;
		this.expectedSalary = expectedSalary;
		this.linkedInProfile = linkedInProfile;
		this.personalDetailsCompleteFlag = personalDetailsCompleteFlag;
	}
	
	
}
