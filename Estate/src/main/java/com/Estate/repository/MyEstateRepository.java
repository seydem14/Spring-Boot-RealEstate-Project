package com.Estate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Estate.entity.MyEstateList;

@EnableJpaRepositories
public interface MyEstateRepository extends JpaRepository<MyEstateList,Integer>{

}
