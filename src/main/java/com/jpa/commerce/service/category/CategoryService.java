package com.jpa.commerce.service.category;

import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.repository.category.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private CategoryRepository categoryRepository;
    public CategoryService( CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    // READ
    public List<CategoryEntity> getList(){
        return this.categoryRepository.findAll();
    }

}
