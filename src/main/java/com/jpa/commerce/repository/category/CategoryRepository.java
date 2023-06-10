package com.jpa.commerce.repository.category;

import com.jpa.commerce.entity.category.CategoryEntity;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
    List<CategoryEntity> findAll(Specification<CategoryEntity> spec);
}