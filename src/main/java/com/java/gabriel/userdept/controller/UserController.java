package com.java.gabriel.userdept.controller;

import com.java.gabriel.userdept.repository.UserRepository;
import com.java.gabriel.userdept.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAll(){
        List<User> result = userRepository.findAll();
        return result;
    }

    @GetMapping(value = "{id}")
    public User findById(@PathVariable Long id){
        User result = userRepository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user){
        User result = userRepository.save(user);
        return result;
    }
}
