package com.edgar.thymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import  com.edgar.thymeleaf.models.Ustable;

@Repository
public interface UserRepository extends JpaRepository<Ustable, Long> {
	
	Ustable findByUsername(String username);

}