package com.auth.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.PersonalDetails;
import com.auth.service.PersonalDetailsService;

@RestController
@RequestMapping("/personal-details")
@CrossOrigin("*")
public class PersonalDetailsController {
	
	@Autowired
	private PersonalDetailsService personalDetailsService;
	
	@PostMapping("/")
    public PersonalDetails createUser(@RequestBody PersonalDetails personalDetails) throws Exception {
        return this.personalDetailsService.createPersonalProfile(personalDetails);
    }
	
	@GetMapping("/getUserProfile/{email}")
    public PersonalDetails getUserProfile(@PathVariable("email") String email) {
        return this.personalDetailsService.getUserProfile(email);
    }
	

}
