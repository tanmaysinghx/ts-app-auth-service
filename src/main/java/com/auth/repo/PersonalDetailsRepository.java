package com.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.model.PersonalDetails;

public interface PersonalDetailsRepository extends JpaRepository<PersonalDetails, Long>{
	
	public PersonalDetails findByEmailId(String emailId);
}
