package com.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.AcademicDetails;
import com.auth.service.AcademicDetailsService;

@RestController
@RequestMapping("/academic-details")
@CrossOrigin("*")
public class AcademicDetailsController {
	
	@Autowired
	private AcademicDetailsService academicDetailsService;
	
	@PostMapping("/")
	public AcademicDetails createAcademicProfile(@RequestBody AcademicDetails academicDetails) throws Exception {
		return this.academicDetailsService.createAcademicProfile(academicDetails);
	}
	
	@GetMapping("/getUserAcademicProfile/{username}")
	public AcademicDetails getUserAcademicProfile(@PathVariable("username") String username) throws Exception {
		return this.academicDetailsService.getUserAcademicProfile(username);
	}

}
