package com.jpa.commerce.repository.category.specification;

import com.jpa.commerce.entity.category.CategoryEntity;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class CategorySpec {
    public static Specification<CategoryEntity> nameLike(String name){
        return (root, query, db) -> db.like(root.get("name"),  "%" + name + "%");
    }

    public static Specification<CategoryEntity> regDateAfter(Date date){
        return (root, query, db) -> db.greaterThan(root.get("regDate"), date);
    }
}
