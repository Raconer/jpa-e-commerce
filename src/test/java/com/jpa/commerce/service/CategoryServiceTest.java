package com.jpa.commerce.service;

import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.service.category.CategoryService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@DisplayName("Category Service Test")
@DataJpaTest
@ActiveProfiles("test")
@Import(CategoryService.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void getListTest(){
        List<CategoryEntity> categoryList = this.categoryService.getList();
        System.out.println(categoryList.toString());
    }

}
