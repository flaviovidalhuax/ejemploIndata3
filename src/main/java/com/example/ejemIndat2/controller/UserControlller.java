package com.example.ejemIndat2.controller;

import com.example.ejemIndat2.entity.UserEntity;
import com.example.ejemIndat2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/v1")

public class UserControlller {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "hola mundo";
    }

    @GetMapping("/allUser")
    public List<UserEntity> getAllUser(){
        return userService.findAll();
    }
    @PostMapping("/saveUser")
    public String postUser(@RequestBody UserEntity user ){
        return userService.creted(user);
    }

    @GetMapping("/user/{ID}")
    public Optional<UserEntity> findById(@PathVariable Long ID){
        return userService.findById(ID);
    }



}
