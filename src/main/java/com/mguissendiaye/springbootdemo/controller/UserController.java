package com.mguissendiaye.springbootdemo.controller;

import com.mguissendiaye.springbootdemo.entity.User;
import com.mguissendiaye.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    private List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Get - Get all the users
    //Post - Save the users
    //Put - Update the user details (Email, Name)
    //Del - Delete the user from email,id or something
    @PostMapping
    private void addStudent(@RequestBody User user) {
        //Save into the database
        //Add validation here
        userRepository.save(user);

    }


}
