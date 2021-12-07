package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.exService.ClgService;
import com.example.demo.Model.College;
import com.example.demo.Model.CollegeBus;
import com.example.demo.Model.Student;

@RestController
@RequestMapping("/test/main")
public class Controller {
	
	@Autowired
	private ClgService clgService;
	
	@GetMapping("/base")
	public Iterable<CollegeBus> fetchAll() {
		return clgService.fetchAllRecords();
	}
	@GetMapping("/base")
	public Iterable<College> fetchAll1() {
		return clgService.fetchAllRecords1();
	}
	@GetMapping("/base")
	public Iterable<Student> fetchAll2() {
		return clgService.fetchAllRecords2();
	}

}
