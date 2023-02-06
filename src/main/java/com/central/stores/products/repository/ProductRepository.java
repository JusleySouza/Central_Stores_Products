package com.central.stores.products.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.central.stores.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
