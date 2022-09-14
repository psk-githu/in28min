package com.APIAssignment.repository;

import com.APIAssignment.entity.Floor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FloorRepo extends JpaRepository<Floor,Integer> {

    @Query(value = "select * from floor,building where floor.building_id=building.building_id and building.building_id=:id",nativeQuery = true)
    List<Floor> floorQuery(@Param("id")int id);
}

