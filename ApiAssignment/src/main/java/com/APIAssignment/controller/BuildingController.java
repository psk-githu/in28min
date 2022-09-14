package com.APIAssignment.controller;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.APIAssignment.entity.Building;
import com.APIAssignment.repository.BuildingRepository;


@RestController
public class BuildingController {

    @Autowired
    private BuildingRepository buildingRepo;

  @GetMapping("/building/getAll")
  public List<Building> getAllBuilding(){
	  return buildingRepo.findAll();
  }
       
    @GetMapping("/building/getByOfficeId/{id}")
    public ResponseEntity<List<Building>> getByOfficeId(@PathVariable int id){
        List<Building> buildings = buildingRepo.buildingQuery(id);
        if(buildings.isEmpty()) {
        	return new ResponseEntity("No Content for Id= "+id,HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity(buildings,HttpStatus.OK);
    }
    
   

	@PostMapping("/create/building")
    public Building createBuilding(@RequestBody Building newbuilding){
		return buildingRepo.save(newbuilding);
		}
  
    @DeleteMapping("/delete/building/{id}")
    public ResponseEntity removeBuilding(@PathVariable int id){
        Optional<Building> buildings = buildingRepo.findById(id);
        if(buildings.isEmpty()) {
        	return new ResponseEntity("No Data for Id= "+id,HttpStatus.NOT_FOUND);
        	}buildingRepo.deleteById(id);
        		
        	 return new ResponseEntity("Successfully Deleted",HttpStatus.ACCEPTED);
    }
    //message field,content,response needed for all api request

    @PutMapping("/update/building")
    public Building updateBuilding(@RequestBody Building building){
        return buildingRepo.save(building);
    } 
}
