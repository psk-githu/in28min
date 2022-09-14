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

import com.APIAssignment.entity.City;
import com.APIAssignment.repository.CityRepository;
import com.APIAssignment.userException.ExceptionResponse;

@RestController
public class CItyController {
	
	@Autowired
	private CityRepository cityRepo;
	
	  @GetMapping("/city/getAll")
	    public List<City> getAllCity(){
	        return cityRepo.cityQuery();
	    }
	  @PostMapping("/create/city")
	    public City createCity(@RequestBody City newCity){
	        return cityRepo.save(newCity);
	    }
	  @DeleteMapping("/delete/city/{id}")
	    public ResponseEntity cityRemove(@PathVariable int id){
	      Optional<City> city = cityRepo.findById(id);
	      if(city.isEmpty()) { 
	       	  return new ResponseEntity("No Data For Id= "+id,HttpStatus.BAD_REQUEST);//cityRepo.deleteById(id);
	      }cityRepo.deleteById(id);
	      	return new ResponseEntity("Successfully Deleted",HttpStatus.ACCEPTED);
	    }

	  @PutMapping("/update/city")
	    public City updateCt(@RequestBody City city){
	        return cityRepo.save(city);
	    }
}
