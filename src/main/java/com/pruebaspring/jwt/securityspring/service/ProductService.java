package com.pruebaspring.jwt.securityspring.service;

import com.pruebaspring.jwt.securityspring.mapper.ProductMapper;
import com.pruebaspring.jwt.securityspring.model.ProductModel;
import com.pruebaspring.jwt.securityspring.repository.IProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements  IProductService{

    private final IProductRepository productResository;
    private final ProductMapper mapper;

    @Override
    public List<ProductModel> findAll() {
     return productResository.findAll().stream().map(mapper::mapToModel).toList();
    }
}
