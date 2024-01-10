package com.example.ejemIndat2.repository;

import com.example.ejemIndat2.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {


    UserEntity findByName(String name);

    @Query(value="SELECT u.id, u.Nombre, u.Edad FROM Usuario u \n" +
            "WHERE u.id=:id", nativeQuery = true)
    public  Object[] findByIdEjmp(Long id);
}