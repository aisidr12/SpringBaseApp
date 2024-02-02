package com.pruebaspring.jwt.securityspring.repository;

import com.pruebaspring.jwt.securityspring.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customers,Long> {
}
