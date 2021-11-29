package com.practice.samplepratice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.samplepratice.model.*;
import com.practice.samplepratice.repository.UserAddressRepository;
import com.practice.samplepratice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	private UserAddressRepository userAddressRepository;
	
	public User changeEmail(String mail, Integer id) {
		Optional<User> savedUser = userRepository.findById(id);
		System.out.println(id);
		if(savedUser.isEmpty()) {
			System.err.println("Not found for ID: "+id);
			return null;
		}else {
			savedUser.get().setEmail(mail);
			return userRepository.save(savedUser.get());
		}
	}
	
	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
	}
	public Iterable<UserAddress> fetchAllRecords1() {
		return userAddressRepository.findAll();
	}
	
	public User createUser(User user) {
		return userRepository.save(user);	
	}
	
	public Iterable<User> deleteEmail(Integer id) {
		Optional<User> user=userRepository.findById(id);
		System.out.println(user);
		userRepository.deleteById(id);	
		return fetchAllRecords();
	}
	
	public List<User> findSimilarRecords(String name) {
		return userRepository.findByName(name);
	}
	
	public List<User> findSimilarRecords(String name, String email) {
		System.out.println("name: "+name+" - email: "+email);
		return userRepository.findByNameAndEmail(name, email);
	}
}
