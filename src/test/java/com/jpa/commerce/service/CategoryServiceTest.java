package com.jpa.commerce.service;

import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.repository.category.CategoryRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@DisplayName("Category Service Test")
@DataJpaTest
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryServiceTest {

    @Autowired
    private CategoryRepository categoryRepository;
    @Test
    public void getListTest(){
        List<CategoryEntity> categoryList = this.categoryRepository.findAll();
        System.out.println(categoryList.toString());
    }

}
