package com.pruebaspring.jwt.securityspring.repository;

import com.pruebaspring.jwt.securityspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {

}
