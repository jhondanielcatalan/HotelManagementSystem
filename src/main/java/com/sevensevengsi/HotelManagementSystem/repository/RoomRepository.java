package com.sevensevengsi.HotelManagementSystem.repository;

import com.sevensevengsi.HotelManagementSystem.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {


    public List<Room> findByHotelId(Long id);



}
