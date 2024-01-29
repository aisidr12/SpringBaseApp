package com.pruebaspring.jwt.securityspring.controller;


import com.pruebaspring.jwt.securityspring.model.ProductModel;
import com.pruebaspring.jwt.securityspring.service.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ProductController {

    private final IProductService iProductService;

    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }

    @GetMapping("/list")
    public ResponseEntity<?> list() {
        List<ProductModel> products = iProductService.findAll();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
