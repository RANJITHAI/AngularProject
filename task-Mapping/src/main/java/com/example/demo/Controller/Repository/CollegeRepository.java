package com.example.demo.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.College;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}
