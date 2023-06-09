package com.jpa.commerce.entity.product;

import com.jpa.commerce.entity.category.CategoriesEntity;
import com.jpa.commerce.entity.common.CommonEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ProductCategories")
@IdClass(ProductCategoriesEntity.ProductCategoryId.class)
public class ProductCategoriesEntity extends CommonEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoriesEntity categories;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity products;

    public static class ProductCategoryId implements Serializable {
        private CategoriesEntity categories;
        private ProductsEntity products;

    }

}
