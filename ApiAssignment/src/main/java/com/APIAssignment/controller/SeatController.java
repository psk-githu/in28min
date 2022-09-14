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

import com.APIAssignment.entity.Seat;
import com.APIAssignment.repository.SeatRepo;


@RestController
public class SeatController {
	
	@Autowired
	private SeatRepo seatRepo;
	
	@GetMapping("/seat/getAll")
	public List<Seat> getAllSeat() {
		return seatRepo.findAll();
	}
	
	 @GetMapping("/seat/getByFloorId/{id}")
	    public ResponseEntity getByFloorId(@PathVariable int id){
	        List<Seat> seat =  seatRepo.seatQuery(id);
	        if(seat.isEmpty()) {
	        	return new ResponseEntity(LocalDateTime.now(),HttpStatus.BAD_REQUEST);
	        }return (ResponseEntity) seat;
	    }
	 @PostMapping("/create/seat")
	    public Seat createSeat(@RequestBody Seat seat){
	        return seatRepo.save(seat);
	    }
	 @DeleteMapping("/delete/seat/{id}")
	    public void removeSeat(@PathVariable int id){
	        seatRepo.deleteById(id);
	    }
	 
	 @PutMapping("/update/seat")
	    public Seat updateSeat(@RequestBody Seat seat){
	        return seatRepo.save(seat);
	    }

}
