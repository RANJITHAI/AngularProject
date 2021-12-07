package com.example.demo.Controller;


import com.example.demo.Service.UserService;
import com.example.demo.model.User;
import com.example.demo.model.UserAddress;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/test/main")
@RestController

public class Controller {

	@Autowired
	UserService userService;

	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}

	// Fetch all data from database
	@GetMapping("/base")
	public Iterable<User> fetchAll() {
		return userService.fetchAllRecords();
	}

	//
	@GetMapping("/Address-base")
	public List<UserAddress> fetchrecords() {
		return userService.fetchAllRecords1();
	}

	// one to one test
	@GetMapping("/all")
	public List<UserAddress> getAll() {
		return userService.findAll();
	}

	// find by id
	@GetMapping("/Findbyid/{id}")
	public Optional<UserAddress> findbyid(@PathVariable Integer id) {
		return userService.findByID(id);
	}

	// Update
	@PostMapping("/update")
	public List<UserAddress> update() {
		return userService.insertrecords();
	}
	
	@PostMapping("/create-user")
	public List<UserAddress> createuser(@RequestBody UserAddress useraa) {
		return userService.createUser(useraa);
	}

}
