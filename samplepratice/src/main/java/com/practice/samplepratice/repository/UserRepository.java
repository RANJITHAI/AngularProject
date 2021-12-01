package com.practice.samplepratice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practice.samplepratice.model.User;

@Repository

public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findByName(String name);
	List<User> findByNameAndEmail(String name, String email);
	@Query(value="select * from user ",nativeQuery=true)
	List<User>findAll();
}