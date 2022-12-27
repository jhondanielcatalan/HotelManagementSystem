package com.sevensevengsi.HotelManagementSystem.repository;

import com.sevensevengsi.HotelManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);

    @Query("select u from User u where u.role  NOT LIKE 'ROLE_ADMIN'")
    public List<User> getAllUsers();



}