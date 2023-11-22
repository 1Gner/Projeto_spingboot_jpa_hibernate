package com.joao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.curso.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
