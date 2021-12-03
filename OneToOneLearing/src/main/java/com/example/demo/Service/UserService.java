package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repository.UserAddressRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;
import com.example.demo.model.UserAddress;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserAddressRepository userAddressRepository;

	public Iterable<User> fetchAllRecords() {
		return userRepository.findAll();
	}

	public List<UserAddress> fetchAllRecords1() {
		return userAddressRepository.findAll();
	}

	public List<UserAddress> findAll() {
		return userAddressRepository.findAll();
	}

	public Optional<UserAddress> findByID(Integer id) {
		// TODO Auto-generated method stub
		return userAddressRepository.findById(id);
	}

	public List<UserAddress> insertrecords() {

		UserAddress useraddress = new UserAddress();

		/*
		 * User user = new User(); user.setId(132); user.setName("RanjithaShree");
		 * user.setEmail("Ranjithashree01@gmail.com");
		 */

		useraddress.setAdd_id(1002);
		useraddress.setStreet("Gandhi nagar");
		useraddress.setCity("Thiruvallur");
		useraddress.setState("TamilNadu");
		useraddress.setCountry("India");
		useraddress.setUser_id(105);

		userAddressRepository.save(useraddress);

		return userAddressRepository.findAll();

	}
}
