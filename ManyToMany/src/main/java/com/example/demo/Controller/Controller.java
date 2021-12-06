package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Govt;
import com.example.demo.Service.GvtService;

@RestController
@RequestMapping("/task/main")
public class Controller {

	@Autowired
	GvtService gvtService;
	
//	@GetMapping("/base")
//	public Iterable<Govt> fetchAll() {
//		return gvtService.fetchAllRecords();
//	}
	@GetMapping("/Query")
	public Iterable<Govt> findAllActiveUsersNative() {
		return gvtService.fetchAllRecords();
	}

}
