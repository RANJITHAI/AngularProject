package com.example.demo.Controller.exService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Controller.Repository.BusRepository;
import com.example.demo.Controller.Repository.CollegeRepository;
import com.example.demo.Controller.Repository.StudentRepository;
import com.example.demo.Model.*;

@Service
public class ClgService {
	@Autowired
	private StudentRepository stdRepository;
	
	@Autowired
	private CollegeRepository clgRepository;
	
	@Autowired
	private BusRepository clgbusRepository;

	public List<CollegeBus> fetchAllRecords() {
		return clgbusRepository.findAll();
	}

	public Optional<CollegeBus> findByID(String busNo) {
		return  clgbusRepository.findById(busNo);
	}
	
//	public Iterable<College> fetchAllRecords1() {
//		return clgRepository.findAll();
//	}
//	
//	public Iterable<Student> fetchAllRecords2() {
//		return stdRepository.findAll();
//	}

}
