package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Govt;

public interface GovtRepository extends JpaRepository<Govt, Integer> {
//	@Query(value = "SELECT * FROM govt_job u WHERE u.job_id = 201", nativeQuery = true)
//	Collection<Govt> findAllActiveUsersNative();
}
