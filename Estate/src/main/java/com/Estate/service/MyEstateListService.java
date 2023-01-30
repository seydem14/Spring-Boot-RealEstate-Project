package com.Estate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Estate.entity.MyEstateList;
import com.Estate.repository.MyEstateRepository;

@Service
public class MyEstateListService {
	@Autowired
	private MyEstateRepository myestate;
	
	
	public void saveMyEstates(MyEstateList estate) {		
		myestate.save(estate);
				
	}
	
	public List<MyEstateList>getAllMyEstates(){
		
		return myestate.findAll();
	}

}
