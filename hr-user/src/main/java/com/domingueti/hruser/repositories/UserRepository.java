package com.domingueti.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domingueti.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}
