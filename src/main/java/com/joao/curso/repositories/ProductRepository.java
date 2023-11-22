package com.joao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
