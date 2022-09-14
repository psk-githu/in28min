package com.APIAssignment.repository;

import com.APIAssignment.entity.SeatType;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatTypeRepo extends JpaRepository<SeatType,Integer> {
	
	 @Query(value = "select * from seat_type,seat where seat_type.seat_type_id=seat.seat_type_id and seat.seat_type_id=:id",nativeQuery = true)
	    List<SeatType> seatTypeQuery(@Param("id")int id);
}
