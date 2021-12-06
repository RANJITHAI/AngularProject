package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Govt;
import com.example.demo.Model.Personal;
import com.example.demo.Repository.GovtRepository;
import com.example.demo.Repository.PersonalRepository;

@Service
public class GvtService {

	@Autowired
	private GovtRepository gvtRepository;
	@Autowired
	private PersonalRepository personalrepository;

	public Iterable<Govt> fetchAllRecords() {
		return gvtRepository.findAll();
	}

	public Govt createUser(Govt govt) {
		return gvtRepository.save(govt);
	}

	public List<Personal> checking() {
		return  personalrepository.findAll();
	}

}
