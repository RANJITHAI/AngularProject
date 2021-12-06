package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Personal;

public interface PersonalRepository extends JpaRepository<Personal,Integer> {

}
