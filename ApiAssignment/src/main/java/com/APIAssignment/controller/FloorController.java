package com.APIAssignment.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

import com.APIAssignment.entity.Floor;
import com.APIAssignment.repository.FloorRepo;
import com.APIAssignment.userException.ExceptionResponse;

@RestController
public class FloorController {
	
	@Autowired
	private FloorRepo floorRepo;
	
	@GetMapping("/floor/getAll")
	public List<Floor> listAllFloor(){
		return floorRepo.findAll();
	}
	
	 @GetMapping("/floor/getByBuildingId/{id}")
	    public ResponseEntity getByBuildingId(@PathVariable int id){
	    	List<Floor> floor = floorRepo.floorQuery(id);
	        if(floor.isEmpty()) {
	        	return new ResponseEntity(LocalDateTime.now(),HttpStatus.BAD_REQUEST);
	        }
	        return (ResponseEntity) floor;
	    }
	 @PostMapping("/create/floor")
	    public Floor createFloor(@RequestBody Floor floor){
	        return floorRepo.save(floor);
	    }

	 @DeleteMapping("/delete/floor/{id}")
	    public void removeFloor(@PathVariable int id){
	        floorRepo.deleteById(id);
	    }
	  @PutMapping("/update/floor")
	    public Floor updateFloor(@RequestBody Floor floor){
	        return floorRepo.save(floor);
	    }
}
