package com.coach.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coach {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String name;
	String sport;
	String phoneNumber;
	String registrationDate;
	String creationTimeStamp;
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getCreationTimeStamp() {
		return creationTimeStamp;
	}
	public void setCreationTimeStamp(String creationTimeStamp) {
		this.creationTimeStamp = creationTimeStamp;
	}
	
	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", sport=" + sport + ", phoneNumber=" + phoneNumber
				+ ", registrationDate=" + registrationDate + ", creationTimeStamp=" + creationTimeStamp + "]";
	}
	
	
}
