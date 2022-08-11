package org.studyeasy.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class User {

@Size(min =5,max=10)
//@Email
private String name;

private String gender,country,introduction,visitedCountry[];
	
	public User() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getIntroduction() {
		return introduction;
	}


	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}


	public String[] getVisitedCountry() {
		return visitedCountry;
	}


	public void setVisitedCountry(String[] visitedCountry) {
		this.visitedCountry = visitedCountry;
	}
	
	

}
