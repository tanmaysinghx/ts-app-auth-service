package com.auth.service;

import com.auth.model.AcademicDetails;

public interface AcademicDetailsService {
	
	//create academic profile
    public AcademicDetails createAcademicProfile(AcademicDetails academicDetails) throws Exception;
    
    //get user data
    public AcademicDetails getUserAcademicProfile(String username) throws Exception;

}
