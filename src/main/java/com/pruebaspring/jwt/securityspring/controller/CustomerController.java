package com.pruebaspring.jwt.securityspring.controller;

import com.pruebaspring.jwt.securityspring.dto.CustomerDto;
import com.pruebaspring.jwt.securityspring.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<CustomerDto>>getCustomerAll(){
        return ResponseEntity.ok(customerService.findAllCustomer());
    }
}
