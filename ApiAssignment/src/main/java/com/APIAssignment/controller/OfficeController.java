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

import com.APIAssignment.entity.Office;
import com.APIAssignment.repository.OfficeRepo;


@RestController
public class OfficeController {
	
	@Autowired
	private OfficeRepo officeRepo;
	
	
	@GetMapping("/office/getAll")
	public List<Office> listAllOffice(){
		return officeRepo.findAll();
	}
	

	 @GetMapping("/office/getByCityId/{id}")
	    public ResponseEntity getByCityId(@PathVariable int id) {
	        List<Office> office = officeRepo.officeQuery1(id);
	        if(office.isEmpty()) {
	        	return new ResponseEntity(LocalDateTime.now(),HttpStatus.BAD_REQUEST);
			}
	        return (ResponseEntity) office;
		}
	 @PostMapping("/create/office")
	    public Office createOffice(@RequestBody Office office){
	        return officeRepo.save(office);
	    }
	  @DeleteMapping("/delete/office/{id}")
	    public void removeOffice(@PathVariable int id){
	        officeRepo.deleteById(id);

	    }
	  @PutMapping("/update/office")
	    public Office updateOffice(@RequestBody Office office){
	        return officeRepo.save(office);
	    }
}
