package com.training.demohibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Contact")
public class Contact {
    @Id
    private int personId;
    
    @Column(name = "address") // Specify column name in the database
    private String address;
    
    @Column(name = "city") // Specify column name in the database
    private String city;
    
    @Column(name = "state") // Specify column name in the database
    private String state;
    
    @Column(name = "country") // Specify column name in the database
    private String country;
    
    @Column(name = "phone") // Specify column name in the database
    private String phone;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Contact(int personId, String address, String city, String state, String country, String phone) {
		super();
		this.personId = personId;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.phone = phone;
	}

	public Contact() {
	}
	
    // Constructors, Getters, and Setters
}