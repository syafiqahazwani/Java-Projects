package com.springboot.cruddemo.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cruddemo.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer>{

}
