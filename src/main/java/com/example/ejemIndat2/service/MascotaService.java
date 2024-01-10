package com.example.ejemIndat2.service;

import com.example.ejemIndat2.entity.MascotaEntity;
import com.example.ejemIndat2.repository.MascotasRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MascotaService {
    @Autowired
    MascotasRepository mascotasRepository;
    public List<MascotaEntity> allMascotas() {
        return (List<MascotaEntity>) mascotasRepository.findAll();
    }
    public void create(MascotaEntity mascota) {
        mascotasRepository.save(mascota);
    }

    public void deletedMasc(Long id) {
         mascotasRepository.deleteById(id);
    }
    public Optional<MascotaEntity> findById(Long id) {
        return  mascotasRepository.findById(id);
    }


}
