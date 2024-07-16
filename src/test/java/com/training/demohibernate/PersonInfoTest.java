package com.training.demohibernate;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.demohibernate.Repository.PersonInfoDAO;
import com.training.demohibernate.model.PersonInfo;

public class PersonInfoTest {
	   private SessionFactory sessionFactory;
	    private PersonInfoDAO personInfoDAO;

	    @Before
	    public void setUp() {
	        // Initialize the SessionFactory and DAO
	        sessionFactory = HibernateUtil.getSessionFactory();
	        personInfoDAO = new PersonInfoDAO(sessionFactory);
	    }

	    @Test
	    public void testPersonInfoCRUD() {
	        // Create instance of PersonInfo
	        PersonInfo person = new PersonInfo();
	        person.setFirstName("John");
	        person.setLastName("Doe");
	        person.setMiddleName("A");
	        person.setGender("Male");

	        // Save the person
	        Integer personId = personInfoDAO.savePersonInfo(person);
	        assertNotNull(personId);

	        // Retrieve the person
	        PersonInfo retrievedPerson = personInfoDAO.getPersonInfo(personId);
	        assertNotNull(retrievedPerson);
	        assertEquals("John", retrievedPerson.getFirstName());

	        // Update the person
	        retrievedPerson.setLastName("UpdatedLastName");
	        personInfoDAO.updatePersonInfo(retrievedPerson);

	        // Retrieve the updated person
	        PersonInfo updatedPerson = personInfoDAO.getPersonInfo(personId);
	        assertEquals("UpdatedLastName", updatedPerson.getLastName());

	        // Delete the person
	        personInfoDAO.deletePersonInfo(updatedPerson);

	        // Verify the person is deleted
	        PersonInfo deletedPerson = personInfoDAO.getPersonInfo(personId);
	        assertNull(deletedPerson);
	    }

	    @After
	    public void tearDown() {
	        if (sessionFactory != null) {
	            sessionFactory.close();
	        }
	    }
	

}
