package com.pruebaspring.jwt.securityspring.service;


import com.pruebaspring.jwt.securityspring.model.ProductModel;

import java.util.List;

public interface IProductService {
     List<ProductModel> findAll();
}
