package com.practice.samplepratice.controller;


import java.time.LocalDate;
import java.util.List;

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
	
	@GetMapping("/beat")
	public String ping() {
		return LocalDate.now().toString();
	}
	
	@PostMapping("/change-email/{id}")
	public User requestChangeEmail(@RequestBody String mail, @PathVariable Integer id) {
		    return userService.changeEmail(mail, id);
	}
		
	@GetMapping("/base")
	public Iterable<User> fecthAll() {
		return userService.fetchAllRecords();
	}
		
	@PostMapping("/create-user")
	public User createuser(@RequestBody User user) {
		return userService.createUser(user);
	}

	@DeleteMapping("/delete-email/{id}")
	public void DeleEmail(@PathVariable(value="id") Integer id) {
		 userService.deleteEmail(id);
	}
	
	@GetMapping("/similar-records/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name){
		return userService.findSimilarRecords(name);
	}
	
	@PostMapping("/similar-records-email/{name}")
	public List<User> fetchSimlarRecordsByName(@PathVariable String name,@RequestBody String email){
    return userService.findSimilarRecords(name,email);
    }
}
