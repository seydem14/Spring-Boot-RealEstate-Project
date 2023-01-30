package com.Estate.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.stereotype.Component;


import com.Estate.entity.Estate;



@EnableJpaRepositories

public interface EstateRepository extends JpaRepository<Estate,Integer>{

	

	

	

}
