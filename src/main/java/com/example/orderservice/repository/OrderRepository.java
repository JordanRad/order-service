package com.example.orderservice.repository;

import com.example.orderservice.models.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {

    @Query("SELECT o FROM Order o WHERE o.status = 0")
    Collection<Order> findAllNewOrders();

    Order findByOrderNumber(String orderNumber);
}
