package com.jpa.commerce.entity.product;

import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.entity.common.CommonEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "ProductCategories")
@IdClass(ProductCategoryEntity.ProductCategoryId.class)
@EqualsAndHashCode(callSuper=false)
public class ProductCategoryEntity extends CommonEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categories;

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity products;

    public static class ProductCategoryId implements Serializable {
        private CategoryEntity categories;
        private ProductsEntity products;

    }

}
