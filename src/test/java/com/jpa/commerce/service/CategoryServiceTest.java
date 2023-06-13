package com.jpa.commerce.service;

import com.jpa.commerce.entity.category.CategoryEntity;
import com.jpa.commerce.service.category.CategoryService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;

import java.util.Date;
import java.util.List;

@DisplayName("Category Service Test")
@DataJpaTest
@ActiveProfiles("test")
@Import(CategoryService.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    // CREATE
    @Test
    public void createTest(){
        // Given
        CategoryEntity category = new CategoryEntity();
        category.setName("첫번째 카테고리");

        // When
        CategoryEntity savedCategory = this.categoryService.create(category);

        // Then
        assertNotNull(savedCategory.getId()); // 저장된 카테고리의 ID가 null이 아닌지 확인
        assertEquals("첫번째 카테고리", savedCategory.getName()); // 저장된 카테고리의 이름이 기대한 값과 일치하는지 확인

    }
    // READ
    @Test
    public void getListTest(){
        // Given
        // When
        List<CategoryEntity> categoryList = this.categoryService.getList();

        // Then
        assertThat(categoryList).isNotNull();
    }

    @Test
    public void getListWithTest(){
        // Given
        String name = "첫번째";
        Date date = new Date();

        // When
        List<CategoryEntity> categoryList = this.categoryService.getListWith(name, date);

        // Then
        assertThat(categoryList).isNotNull();
    }


}
