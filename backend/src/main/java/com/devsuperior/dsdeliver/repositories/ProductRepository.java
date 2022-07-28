package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
