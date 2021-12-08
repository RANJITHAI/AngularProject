package com.example.demo.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.CollegeBus;

public interface BusRepository extends JpaRepository<CollegeBus,String>{

}
