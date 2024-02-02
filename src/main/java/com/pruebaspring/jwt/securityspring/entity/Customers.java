package com.pruebaspring.jwt.securityspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Long customerId;

    @Column(name = "nombre_completo")
    private String fullName;

    @Column(name = "correo")
    private String email;

    @Column(name = "numero_celular")
    private String numberCellphone;

    @Column(name = "activo")
    private Integer active;

    @Column(name = "contrasenia")
    private String password;

    private String rol;

}
