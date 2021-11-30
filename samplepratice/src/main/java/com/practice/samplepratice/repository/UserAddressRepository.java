package com.practice.samplepratice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.samplepratice.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {
	//Optional<UserAddress> findById(Integer id);

}
