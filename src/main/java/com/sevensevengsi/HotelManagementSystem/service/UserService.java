package com.sevensevengsi.HotelManagementSystem.service;

import com.sevensevengsi.HotelManagementSystem.model.User;

import java.util.List;

public interface UserService {


    List<User> getAllUser(User user);

    public void createUser(User user);

    void saveUser(User user);

    void deleteUser(User user);
}
