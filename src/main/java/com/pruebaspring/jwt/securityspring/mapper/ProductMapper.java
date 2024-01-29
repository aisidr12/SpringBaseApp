package com.pruebaspring.jwt.securityspring.mapper;

import com.pruebaspring.jwt.securityspring.entity.Product;
import com.pruebaspring.jwt.securityspring.model.ProductModel;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductModel mapToModel(Product product) {
        return ProductModel.builder()
                .product_id(product.getProduct_id())
                .name(product.getName())
                .category(product.getCategory())
                .build();
    }
}
