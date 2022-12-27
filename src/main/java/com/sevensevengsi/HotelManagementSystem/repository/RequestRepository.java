package com.sevensevengsi.HotelManagementSystem.repository;

import com.sevensevengsi.HotelManagementSystem.model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RequestRepository extends JpaRepository<Request,Long> {

  //  @Query("select AVG(myHotel.Amount) from Request myHotel where u.role  NOT LIKE 'ROLE_ADMIN'")
//    public Request findByOwnerId(Long OwnerId);

}
