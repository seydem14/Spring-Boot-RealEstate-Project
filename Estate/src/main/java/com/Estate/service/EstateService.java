package com.Estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Estate.entity.Estate;
import com.Estate.repository.EstateRepository;

@Service

public class EstateService {
	@Autowired
	private EstateRepository eRepo;

	public void save(Estate e) {
		eRepo.save(e);

	}

	public List<Estate> getAllEstates() {
		return eRepo.findAll();
	}

	public Estate getEstateById(int id) {
		return eRepo.findById(id).get();
	}
}
