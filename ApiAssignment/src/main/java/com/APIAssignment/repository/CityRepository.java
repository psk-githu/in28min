package com.APIAssignment.repository;

import com.APIAssignment.entity.City;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
   
	@Query(value = "SELECT * FROM city",nativeQuery = true)
    List<City> cityQuery();

}
    
    
    
    
//    @Modifying
//    @Query(value = "update city set city_name=':city_name' where city_id=:id",nativeQuery = true)
//    City countCity(@Param("id")int id,@Param("city_name") String city_name)



 