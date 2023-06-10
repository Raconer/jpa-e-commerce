package com.jpa.commerce.repository.category;

import com.jpa.commerce.entity.category.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> { }