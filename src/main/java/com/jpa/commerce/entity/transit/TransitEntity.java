package com.jpa.commerce.entity.transit;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.jpa.commerce.entity.common.CommonEntity;
import com.jpa.commerce.entity.orders.OrdersEntity;

@Entity
@Table(name = "Transit")
public class TransitEntity extends CommonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "orders_id")
    private OrdersEntity orders;

    @Column
    private Date transitDate;

}
