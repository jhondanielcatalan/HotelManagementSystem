package com.sevensevengsi.HotelManagementSystem.service;

import com.sevensevengsi.HotelManagementSystem.model.User;
import com.sevensevengsi.HotelManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

public class UserServiceImplementation implements UserService{

    @Autowired
    UserRepository userRepo;

    @Autowired
    private BCryptPasswordEncoder passwordEncode;

    @Override
    public List<User> getAllUser(User user) {
        if(user.getRole().equals("ROLE_ADMIN"))
        {
            return userRepo.getAllUsers();
        }
        else
        {
            return null;
        }

    }

    @Override
    public void createUser(User user) {

        user.setPassword(passwordEncode.encode(user.getPassword()));
        user.setEnabled(true);
        user.setAccountNonLocked(true);
        if (user.getRole() == null) {
            user.setRole("CUSTOMER");
        }
        userRepo.save(user);
    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteUser(User user) {
        userRepo.deleteById(user.getId());
    }
}
