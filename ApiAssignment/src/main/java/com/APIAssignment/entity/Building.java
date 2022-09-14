package com.APIAssignment.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="building")
public
class Building {

    @Id
    @GeneratedValue
    private int buildingId;
    private byte isActive;
    private String buildingName;
    private int officeId;
	public int getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getOfficeId() {
		return officeId;
	}
	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}
	public Building(int buildingId, byte isActive, String buildingName, int officeId) {
		
		this.buildingId = buildingId;
		this.isActive = isActive;
		this.buildingName = buildingName;
		this.officeId = officeId;
	}
	public Building() {
		
	}
    
    
    
}