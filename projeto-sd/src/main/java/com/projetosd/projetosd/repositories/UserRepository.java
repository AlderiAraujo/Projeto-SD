package com.projetosd.projetosd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosd.projetosd.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
