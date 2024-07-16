package com.training.demohibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demohibernate.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
}


