package com.example.ejemIndat2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // @Getter  @Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Muchas mascotas")
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "genero")
    private String gender;

    @ManyToOne
    @JoinTable(name = "id_usuario")
    private UserEntity user;

}
