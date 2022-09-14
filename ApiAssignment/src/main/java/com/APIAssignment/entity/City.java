package com.APIAssignment.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity(name="city")
public class City {

    @Id
    @GeneratedValue
    private int cityId;
    private byte isActive;
    private String cityName;
    private String country;
    private String pinCode;
    private String stateName;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public City(int cityId, byte isActive, String cityName, String country, String pinCode, String stateName) {
		
		this.cityId = cityId;
		this.isActive = isActive;
		this.cityName = cityName;
		this.country = country;
		this.pinCode = pinCode;
		this.stateName = stateName;
	}
	public City() {
		
	}
    
}

