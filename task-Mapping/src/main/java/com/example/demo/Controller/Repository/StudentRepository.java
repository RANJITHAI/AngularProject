package com.example.demo.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
