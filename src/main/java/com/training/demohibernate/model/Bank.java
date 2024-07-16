package com.training.demohibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {
    @Id
    private int personId;
    
    @Column(name = "bank_name") // Specify column name in the database
    private String bankname;
    
    @Column(name = "bank_number") // Specify column name in the database
    private String banknumber;
    
    @Column(name = "ssn") // Specify column name in the database
    private String ssn;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBanknumber() {
		return banknumber;
	}

	public void setBanknumber(String banknumber) {
		this.banknumber = banknumber;
	}

	public String getssn() {
		return ssn;
	}

	public void sessn(String ssn) {
		this.ssn = ssn;
	}
	
	public Bank() {
		super();
	}

	public Bank(int personId, String bankname, String banknumber, String ssn) {
		super();
		this.personId = personId;
		this.bankname = bankname;
		this.banknumber = banknumber;
		this.ssn = ssn;
	}
    
    // Constructors, Getters, and Setters
}