package com.APIAssignment.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="floor")
public class Floor {

    @Id
    @GeneratedValue
    private int floorId;
    private byte isActive;
    private String floorName;
    private String floorPlan;
    private int buildingId;
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getFloorPlan() {
		return floorPlan;
	}
	public void setFloorPlan(String floorPlan) {
		this.floorPlan = floorPlan;
	}
	public int getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}
	public Floor(int floorId, byte isActive, String floorName, String floorPlan, int buildingId) {
	
		this.floorId = floorId;
		this.isActive = isActive;
		this.floorName = floorName;
		this.floorPlan = floorPlan;
		this.buildingId = buildingId;
	}
	public Floor() {
		
	}
    
    
    
}
