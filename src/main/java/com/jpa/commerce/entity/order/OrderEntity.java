package com.jpa.commerce.entity.order;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.ColumnDefault;

import com.jpa.commerce.entity.common.CommonEntity;
import com.jpa.commerce.entity.product.ProductsEntity;
@Data
@Entity
@Table(name = "orders")
@EqualsAndHashCode(callSuper=false)
public class OrderEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductsEntity product;

    @Column
    @ColumnDefault("0")
    private int quantity;

    @Column
    private Date orderDate;

}
