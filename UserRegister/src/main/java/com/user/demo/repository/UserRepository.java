package com.user.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.demo.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	User findByEmail(String email);;
	User findByUsernameAndPassword(String username, String password);
}





