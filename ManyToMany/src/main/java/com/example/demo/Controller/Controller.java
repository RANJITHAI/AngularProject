package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Govt;
import com.example.demo.Model.Personal;
import com.example.demo.Service.GvtService;

@RestController
@RequestMapping("/task/main")
public class Controller {

	@Autowired
	GvtService gvtService;
	
	@GetMapping("/base")
	public Iterable<Govt> fetchAll() {
		return gvtService.fetchAllRecords();
	}
	@PostMapping("/create-user")
	public Govt createuser(@RequestBody Govt govt) {
		return gvtService.createUser(govt);
	}
	@GetMapping("/check")
	public List<Personal> checking() {
		return gvtService.checking();
	}

}
