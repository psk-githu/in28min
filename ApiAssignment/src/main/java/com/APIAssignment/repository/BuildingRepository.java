package com.APIAssignment.repository;

import com.APIAssignment.entity.Building;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {


    @Query(value = "select * from office,building where building.office_id=office.officeid and office.officeid=:id",nativeQuery = true)
    List<Building> buildingQuery(@Param("id") int id);
}



//    @Query(value = "SELECT building_id,building_name FROM building bs WHERE " +
//            "(SELECT office_id FROM office o WHERE bs.building_id = o.officeid ) and office.officeid=:id",
//            nativeQuery = true)
//    List<Building> buildingQuery(@Param("id") int id);
//}
