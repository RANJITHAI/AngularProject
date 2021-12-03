package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {

}
