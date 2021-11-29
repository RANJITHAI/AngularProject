package com.practice.samplepratice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.samplepratice.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {

}
