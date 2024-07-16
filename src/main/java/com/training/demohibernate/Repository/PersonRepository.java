package com.training.demohibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demohibernate.model.PersonInfo;

@Repository
public interface PersonRepository extends JpaRepository<PersonInfo, Integer> {
	
}


