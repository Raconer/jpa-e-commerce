package com.jpa.commerce.repository.product;

import com.jpa.commerce.entity.product.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductsEntity, Long> {
}
