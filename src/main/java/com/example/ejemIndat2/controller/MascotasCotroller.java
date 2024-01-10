package com.example.ejemIndat2.controller;

import com.example.ejemIndat2.entity.MascotaEntity;
import com.example.ejemIndat2.service.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/mascotas/")
public class MascotasCotroller {
    @Autowired
    MascotaService mascotaService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/all")
    public List<MascotaEntity> getAllMasc(){
        return mascotaService.allMascotas();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public void postMasc(@RequestBody MascotaEntity mascota){
        mascotaService.create(mascota);
    }
    @ResponseStatus(HttpStatus.GONE)
    @DeleteMapping("/deleted/{id}")
    public String deletedMasc(@PathVariable Long id){
        mascotaService.deletedMasc(id);
        return "eliminado";
    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public Optional<MascotaEntity> getById(@PathVariable Long id){
        return mascotaService.findById(id);
    }

}
