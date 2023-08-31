package com.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.helper.UserFoundException;

import com.auth.model.PersonalDetails;
import com.auth.repo.PersonalDetailsRepository;
import com.auth.service.PersonalDetailsService;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService {
	
	@Autowired
	private PersonalDetailsRepository personalDetailsRepository;
	
	// create personal profile
	@Override
	public PersonalDetails createPersonalProfile(PersonalDetails personalDetails) throws Exception {
		PersonalDetails local = this.personalDetailsRepository.findByEmailId(personalDetails.getEmailId());
        if (local != null) {
            System.out.println("User personal data is already there !!");
            throw new UserFoundException();
        } else {
            local = this.personalDetailsRepository.save(personalDetails);
        }
		return local;
	}
	
	// get user profile data
	@Override 
	 public PersonalDetails getUserProfile(String email) {
		return this.personalDetailsRepository.findByEmailId(email);
	}

}
