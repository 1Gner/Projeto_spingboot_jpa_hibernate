package com.joao.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.curso.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
