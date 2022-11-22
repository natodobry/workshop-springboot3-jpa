package com.natodobry.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natodobry.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
