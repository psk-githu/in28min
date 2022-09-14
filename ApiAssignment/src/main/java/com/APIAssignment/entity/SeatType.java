package com.APIAssignment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="seat_type")
public class SeatType {

    @Id
    @GeneratedValue
    private int seatTypeId;
    private String seatCode;
    private String seatName;
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public String getSeatCode() {
		return seatCode;
	}
	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}
	public String getSeatName() {
		return seatName;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public SeatType(int seatTypeId, String seatCode, String seatName) {
		
		this.seatTypeId = seatTypeId;
		this.seatCode = seatCode;
		this.seatName = seatName;
	}
	public SeatType() {
		
	}
    
    
}
