package com.training.demohibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="PersonInfo")
public class PersonInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int personId;
    
    @Column(name = "first_name")
    private String firstName;
    
    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "middle_name")
    private String middleName;
    
    private String gender;

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
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


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}
    public PersonInfo() {
    	super();
    }

	public PersonInfo(int personId, String firstName, String lastName, String middleName, String gender) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.gender = gender;
	}

    // Constructors, Getters, and Setters
}

/*
@Entity(name="PersonInfo")
public class PersonInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int personId;
	
	private String first_name;
	private String last_name;
	private String middle_name;
	private String gender;
	
	public PersonInfo() {
		super();
	}
	
	public PersonInfo(int personId, String firstName, String lastName, String middleName, String gender) {
		super();
		this.personId = personId;
		this.first_name = firstName;
		this.last_name = lastName;
		this.middle_name = middleName;
		this.gender = gender;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public String getMiddleName() {
		return middle_name;
	}
	public void setMiddleName(String middleName) {
		this.middle_name = middleName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
*/
