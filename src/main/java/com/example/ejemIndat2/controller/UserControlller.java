package com.example.ejemIndat2.controller;

import com.example.ejemIndat2.entity.UserEntity;
import com.example.ejemIndat2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/api/v1")

public class UserControlller {
    @Autowired
    UserService userService;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/hello")
    public String hello(){
        return "hola mundo";
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/allUser")
    public List<UserEntity> getAllUser(){
        return userService.findAll();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/saveUser")
    public String postUser(@RequestBody UserEntity user ){
        return userService.creted(user);
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/{ID}")
    public Optional<UserEntity> findById(@PathVariable Long ID){
        return userService.findById(ID);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/user/{id}")
    public String deletedById(@PathVariable Long id){
        userService.deletedById(id);
        return "eliminado";
    }
    @ResponseStatus(HttpStatus.GONE)
    @PutMapping("/user/{id}")
    public String putUser(@PathVariable Long id,@RequestBody UserEntity user){
        userService.actualizar( id,user);
        return "actualizado";
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/username/{name}")
    public UserEntity  getname(@PathVariable String name){
      UserEntity data =userService.findByName(name);
       return data;
    }

    @GetMapping("/userbyID/{id}")
    public String getByIdEjemplo(@PathVariable Long id){
        userService.findByIdEjemplo(id);
        return id.toString();
    }

//    @GetMapping("user/{name}")
//    public String getByName(@PathVariable String name){
//        userService.findByName(name);
//        return "by Id";
//    }

}
