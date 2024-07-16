package com.training.demohibernate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.demohibernate.model.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
	
}


