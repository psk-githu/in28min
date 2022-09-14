package com.APIAssignment.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name="seat")
public class Seat {

    @Id
    @GeneratedValue
    private int seatId;
    private byte isActive;
    private int cubicleId;
    @Column(columnDefinition = "varchar(20) default 'TL'")
    private String qrNumber;
    private int seatNumber;
    @Column(columnDefinition = "varchar(20) default 'Team_Lead'")
    private String seatType;
    private int floorId;
    private int seatTypeId;
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public int getCubicleId() {
		return cubicleId;
	}
	public void setCubicleId(int cubicleId) {
		this.cubicleId = cubicleId;
	}
	public String getQrNumber() {
		return qrNumber;
	}
	public void setQrNumber(String qrNumber) {
		this.qrNumber = qrNumber;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getSeatTypeId() {
		return seatTypeId;
	}
	public void setSeatTypeId(int seatTypeId) {
		this.seatTypeId = seatTypeId;
	}
	public Seat(int seatId, byte isActive, int cubicleId, String qrNumber, int seatNumber, String seatType, int floorId,
			int seatTypeId) {
		
		this.seatId = seatId;
		this.isActive = isActive;
		this.cubicleId = cubicleId;
		this.qrNumber = qrNumber;
		this.seatNumber = seatNumber;
		this.seatType = seatType;
		this.floorId = floorId;
		this.seatTypeId = seatTypeId;
	}
	public Seat() {
		
	}
    
    
}
