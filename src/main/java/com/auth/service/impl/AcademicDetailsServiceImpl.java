package com.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.helper.UserFoundException;
import com.auth.model.AcademicDetails;
import com.auth.repo.AcademicDetailsRepository;
import com.auth.service.AcademicDetailsService;

@Service
public class AcademicDetailsServiceImpl implements AcademicDetailsService {
	
	@Autowired
	private AcademicDetailsRepository academicDetailsRepository;
	
	//create academic profile
	@Override
	public AcademicDetails createAcademicProfile(AcademicDetails academicDetails) throws Exception {
		AcademicDetails local = this.academicDetailsRepository.findByUsername(academicDetails.getUsername());
		if (local != null) {
            System.out.println("User personal data is already there !!");
            throw new UserFoundException();
        } else {
        	local = this.academicDetailsRepository.save(academicDetails);
        }
		return local;
	}

	@Override
	public AcademicDetails getUserAcademicProfile(String username) throws Exception {
		return this.academicDetailsRepository.findByUsername(username);
	}

}
