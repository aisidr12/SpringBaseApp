package com.pruebaspring.jwt.securityspring.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductModel {
    Integer product_id;
    String name;
    String category;
}
