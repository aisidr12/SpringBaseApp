package com.pruebaspring.jwt.securityspring.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table
@Getter
@Setter
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    private String name;
    private String category;
}
