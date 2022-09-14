package com.APIAssignment.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APIAssignment.entity.SeatType;
import com.APIAssignment.repository.SeatTypeRepo;

@RestController
public class SeatTypeController {
	
	@Autowired
	private SeatTypeRepo seatTypeRepo;
	
	@GetMapping("/seatType/getAll")
	public List<SeatType> listAllSeatType(){
		return seatTypeRepo.findAll();
	}
	
	 @GetMapping("/seatType/getBySeatTypeId/{id}")
	    public ResponseEntity getBySeatId(@PathVariable int id){
	        List<SeatType> seatType = seatTypeRepo.seatTypeQuery(id);
	        if(seatType.isEmpty()) {
	        	return new ResponseEntity(LocalDateTime.now(),HttpStatus.BAD_REQUEST);
	        }return (ResponseEntity) seatType;
	    }
	 @PostMapping("/create/seatType")
	    public SeatType createSeatType(@RequestBody SeatType seatType){
	        return seatTypeRepo.save(seatType);
	    }
	 @DeleteMapping("/delete/seatType/{id}")
	    public void removeSeat(@PathVariable int id){
	        seatTypeRepo.deleteById(id);
	    }
	 
	 @PutMapping("/update/seatType")
	    public SeatType updateSeatType(@RequestBody SeatType seatType){
	        return seatTypeRepo.save(seatType);
	    }

}
