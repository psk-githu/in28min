package com.APIAssignment.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value="cityId")
@Entity(name="office")
public class Office {

    @Id
    @GeneratedValue
    private int officeid;
    private byte isActive;
    private String officeName;
    
    private int cityId;
    
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public Office(int officeid, byte isActive, String officeName, int cityId) {
		
		this.officeid = officeid;
		this.isActive = isActive;
		this.officeName = officeName;
		this.cityId = cityId;
	}
	public Office() {
		
	}
    
    
    
}
