package com.spring.integration.bean;

public class UserRegistration {

	private String firstName;
	private String lastName;
	private String company;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String url;
	private String phoneNumber;
	private String fax;

	public UserRegistration() {
		// TODO Auto-generated constructor stub
	}

	public UserRegistration(String firstName, String lastName, String company, String address, String city,
			String state, String zip, String country, String url, String phoneNumber, String fax) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.url = url;
		this.phoneNumber = phoneNumber;
		this.fax = fax;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstName=" + firstName + ", lastName=" + lastName + ", company=" + company
				+ ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country="
				+ country + ", url=" + url + ", phoneNumber=" + phoneNumber + ", fax=" + fax + "]";
	}

}
