package com.auth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "academicDetails")
public class AcademicDetails {
	
	public AcademicDetails() {}
	
	@Id
	private String username;
	private String highSchoolName;
	private String highSchoolBoard;
	private String highSchoolPercentage;
	private String highSchoolYear;
	private String secondarySchoolName;
	private String secondarySchoolBoard;
	private String secondarySchoolPercentage;
	private String secondarySchoolYear;
	private String graduationSchoolName;
	private String graduationSchoolBoard;
	private String graduationSchoolPercentage;
	private String graduationSchoolYear;
	private String graduationSchoolSpecialization;
	private String graduationSchoolDegree;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHighSchoolName() {
		return highSchoolName;
	}
	public void setHighSchoolName(String highSchoolName) {
		this.highSchoolName = highSchoolName;
	}
	public String getHighSchoolBoard() {
		return highSchoolBoard;
	}
	public void setHighSchoolBoard(String highSchoolBoard) {
		this.highSchoolBoard = highSchoolBoard;
	}
	public String getHighSchoolPercentage() {
		return highSchoolPercentage;
	}
	public void setHighSchoolPercentage(String highSchoolPercentage) {
		this.highSchoolPercentage = highSchoolPercentage;
	}
	public String getHighSchoolYear() {
		return highSchoolYear;
	}
	public void setHighSchoolYear(String highSchoolYear) {
		this.highSchoolYear = highSchoolYear;
	}
	public String getSecondarySchoolName() {
		return secondarySchoolName;
	}
	public void setSecondarySchoolName(String secondarySchoolName) {
		this.secondarySchoolName = secondarySchoolName;
	}
	public String getSecondarySchoolBoard() {
		return secondarySchoolBoard;
	}
	public void setSecondarySchoolBoard(String secondarySchoolBoard) {
		this.secondarySchoolBoard = secondarySchoolBoard;
	}
	public String getSecondarySchoolPercentage() {
		return secondarySchoolPercentage;
	}
	public void setSecondarySchoolPercentage(String secondarySchoolPercentage) {
		this.secondarySchoolPercentage = secondarySchoolPercentage;
	}
	public String getSecondarySchoolYear() {
		return secondarySchoolYear;
	}
	public void setSecondarySchoolYear(String secondarySchoolYear) {
		this.secondarySchoolYear = secondarySchoolYear;
	}
	public String getGraduationSchoolName() {
		return graduationSchoolName;
	}
	public void setGraduationSchoolName(String graduationSchoolName) {
		this.graduationSchoolName = graduationSchoolName;
	}
	public String getGraduationSchoolBoard() {
		return graduationSchoolBoard;
	}
	public void setGraduationSchoolBoard(String graduationSchoolBoard) {
		this.graduationSchoolBoard = graduationSchoolBoard;
	}
	public String getGraduationSchoolPercentage() {
		return graduationSchoolPercentage;
	}
	public void setGraduationSchoolPercentage(String graduationSchoolPercentage) {
		this.graduationSchoolPercentage = graduationSchoolPercentage;
	}
	public String getGraduationSchoolYear() {
		return graduationSchoolYear;
	}
	public void setGraduationSchoolYear(String graduationSchoolYear) {
		this.graduationSchoolYear = graduationSchoolYear;
	}
	public String getGraduationSchoolSpecialization() {
		return graduationSchoolSpecialization;
	}
	public void setGraduationSchoolSpecialization(String graduationSchoolSpecialization) {
		this.graduationSchoolSpecialization = graduationSchoolSpecialization;
	}
	public String getGraduationSchoolDegree() {
		return graduationSchoolDegree;
	}
	public void setGraduationSchoolDegree(String graduationSchoolDegree) {
		this.graduationSchoolDegree = graduationSchoolDegree;
	}
	public AcademicDetails(String username, String highSchoolName, String highSchoolBoard, String highSchoolPercentage,
			String highSchoolYear, String secondarySchoolName, String secondarySchoolBoard,
			String secondarySchoolPercentage, String secondarySchoolYear, String graduationSchoolName,
			String graduationSchoolBoard, String graduationSchoolPercentage, String graduationSchoolYear,
			String graduationSchoolSpecialization, String graduationSchoolDegree) {
		super();
		this.username = username;
		this.highSchoolName = highSchoolName;
		this.highSchoolBoard = highSchoolBoard;
		this.highSchoolPercentage = highSchoolPercentage;
		this.highSchoolYear = highSchoolYear;
		this.secondarySchoolName = secondarySchoolName;
		this.secondarySchoolBoard = secondarySchoolBoard;
		this.secondarySchoolPercentage = secondarySchoolPercentage;
		this.secondarySchoolYear = secondarySchoolYear;
		this.graduationSchoolName = graduationSchoolName;
		this.graduationSchoolBoard = graduationSchoolBoard;
		this.graduationSchoolPercentage = graduationSchoolPercentage;
		this.graduationSchoolYear = graduationSchoolYear;
		this.graduationSchoolSpecialization = graduationSchoolSpecialization;
		this.graduationSchoolDegree = graduationSchoolDegree;
	}
	
}
