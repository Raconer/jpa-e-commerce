package com.jpa.commerce.service.category;

import com.jpa.commerce.core.SpecBuilder;
import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.repository.category.CategoryRepository;
import com.jpa.commerce.repository.category.specification.CategorySpec;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // CREATE
    public CategoryEntity create(CategoryEntity category) {
        Date curDate = new Date();
        category.setRegDate(curDate);
        category.setModDate(curDate);
        return this.categoryRepository.save(category);
    }

    // READ
    public List<CategoryEntity> getList() {
        return this.categoryRepository.findAll();
    }

    public List<CategoryEntity> getListWith(String name, Date regDate) {
        Specification<CategoryEntity> spec = SpecBuilder.builder(CategoryEntity.class)
                .ifHasText(name, str -> CategorySpec.nameLike(name))
                .ifNotNull(regDate, value -> CategorySpec.regDateAfter(value)).toSpec();
        return this.categoryRepository.findAll(spec);
    }
}
