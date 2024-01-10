package com.example.ejemIndat2.service;


import com.example.ejemIndat2.entity.UserEntity;
import com.example.ejemIndat2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public List<UserEntity> findAll(){
        return (List<UserEntity>) userRepository.findAll();
    }

    public String creted(UserEntity user){
        userRepository.save(user);
        return "user created";
    }
    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public String deletedById(Long id){
        userRepository.deleteById(id);
        return "eliminado";
    }
    public String actualizar(Long id,UserEntity userAct){
        Optional<UserEntity> user1=userRepository.findById(id);
        user1.orElseThrow().setName(userAct.getName());
        user1.orElseThrow().setAge(userAct.getAge());
        return "actualizado";
    }

    public UserEntity findByName(String name) {
        UserEntity data =userRepository.findByName(name);
        return data;
    }

    public void findByIdEjemplo(Long id) {
        userRepository.findByIdEjmp(id);
    }
}
