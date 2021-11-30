package com.practice.samplepratice.controller;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.samplepratice.model.*;
import com.practice.samplepratice.service.UserService;

@RequestMapping("/main")
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	//Basic check
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}
	
	//Changing email 
	@PostMapping("/change-email/{id}")
	public User requestChangeEmail(@RequestBody String mail, @PathVariable Integer id) {
		    return userService.changeEmail(mail, id);
	}
	
	//Fetch all datas from database
	@GetMapping("/base")
	public Iterable<User> fecthAll() {
		return userService.fetchAllRecords();
	}
	
	//Insert Parent table
	@PostMapping("/create-user")
	public User createuser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/address/{id}")
	public List<UserAddress> inserts(@RequestBody List<UserAddress> userAddress, @PathVariable Integer id) {
		return userService.insertaddr(userAddress, id);
	}
	
	//Delete method
	@DeleteMapping("/delete-email/{id}")
	public void DeleEmail(@PathVariable(value="id") Integer id) {
		 userService.deleteEmail(id);
	}
	
	//fetching similar records
	@GetMapping("/similar-records/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name){
		return userService.findSimilarRecords(name);
	}
	
	//fetching similar records name and email
	@PostMapping("/similar-records-email/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name,@RequestBody String email){
    return userService.findSimilarRecords(name,email);
    }
	
	//Display Manytoone table values
	@GetMapping("/base1")
	public Iterable<User> many(){
		return userService.manyToOneEx();
	}
}
