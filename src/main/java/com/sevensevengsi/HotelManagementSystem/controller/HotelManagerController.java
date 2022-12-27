package com.sevensevengsi.HotelManagementSystem.controller;

import com.sevensevengsi.HotelManagementSystem.model.User;
import com.sevensevengsi.HotelManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@Controller
@RequestMapping("/manager")
public class HotelManagerController {
    @Autowired
    private UserRepository userRepo;

    @ModelAttribute
    private void userDetails(Model m, Principal p) {
        String userName = p.getName();
        User user = userRepo.findByUsername(userName);
        m.addAttribute("user", user);
    }

    @GetMapping("/")
    public String home(Model model) {
        return "/manager";
    }
}
