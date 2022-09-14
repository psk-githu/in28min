package com.APIAssignment.repository;

import com.APIAssignment.entity.Seat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepo extends JpaRepository<Seat,Integer> {

    @Query(value = "select * from seat,floor where seat.floor_id=floor.floor_id and floor.floor_id=:id",nativeQuery = true)
    List<Seat> seatQuery(@Param("id")int id);
}
