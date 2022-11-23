package com.natodobry.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natodobry.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
