package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;
import com.example.demo.model.UserAddress;

public interface UserRepository extends JpaRepository<User,Integer> {

	List<UserAddress> save(UserAddress useraa);
	
}