package com.auth.service;


import com.auth.model.PersonalDetails;


public interface PersonalDetailsService {
	
	//create personal profile
    public PersonalDetails createPersonalProfile(PersonalDetails personalDetails) throws Exception;
    
    //get user data
    public PersonalDetails getUserProfile(String email);

}
