package com.APIAssignment.repository;

import com.APIAssignment.entity.Office;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfficeRepo extends JpaRepository<Office,Integer> {


    @Query(value = "select officeid,office_name from office where (select city_id from city where office.city_id=city.city_id) and office.city_id =:id",nativeQuery = true)
    List<Office> officeQuery1(@Param("id") int id);
}
//select officeid,is_Active,office_Name from office where (select city_id from city where office.city_id=city.city_id)