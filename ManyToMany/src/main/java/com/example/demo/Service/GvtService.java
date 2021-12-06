package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Govt;
import com.example.demo.Repository.GovtRepository;
import com.example.demo.Repository.PersonalRepository;

@Service
public class GvtService {
	
	@Autowired
	private GovtRepository gvtRepository;
	
//	@Autowired
//	private PersonalRepository perRepository;

	public Iterable<Govt> fetchAllRecords() {
		return gvtRepository.findAll();
	}

}
