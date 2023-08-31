package com.auth.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.model.AcademicDetails;
import java.util.List;



public interface AcademicDetailsRepository extends JpaRepository<AcademicDetails, Long>{
	public AcademicDetails findByUsername(String username);
}
