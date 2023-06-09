package com.jpa.commerce.entity.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import com.jpa.commerce.entity.common.CommonEntity;
@Data
@Entity
@Table(name = "Products")
@EqualsAndHashCode(callSuper=false)
public class ProductsEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @ColumnDefault("0")
    private Double price;
}
