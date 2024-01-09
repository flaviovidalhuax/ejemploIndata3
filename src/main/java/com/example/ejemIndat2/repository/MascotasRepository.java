package com.example.ejemIndat2.repository;

import com.example.ejemIndat2.entity.MascotaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotasRepository extends CrudRepository<MascotaEntity,Long> {

}
