package com.jpa.commerce.repository.order;

import com.jpa.commerce.entity.order.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long > {
}
