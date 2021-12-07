package com.example.demo.Controller.exService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Controller.Repository.BusRepository;
import com.example.demo.Controller.Repository.CollegeRepository;
import com.example.demo.Controller.Repository.StudentRepository;
import com.example.demo.Model.College;
import com.example.demo.Model.CollegeBus;
import com.example.demo.Model.Student;

@Service
public class ClgService {
	@Autowired
	private StudentRepository stdRepository;
	
	@Autowired
	private CollegeRepository clgRepository;
	
	@Autowired
	private BusRepository busRepository;

	public Iterable<CollegeBus> fetchAllRecords() {
		return busRepository.findAll();
	}
	
	public Iterable<College> fetchAllRecords1() {
		return clgRepository.findAll();
	}
	
	public Iterable<Student> fetchAllRecords2() {
		return stdRepository.findAll();
	}

}
