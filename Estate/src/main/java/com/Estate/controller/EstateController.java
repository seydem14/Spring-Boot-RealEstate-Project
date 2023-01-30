package com.Estate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Estate.entity.Estate;
import com.Estate.entity.MyEstateList;
import com.Estate.service.EstateService;
import com.Estate.service.MyEstateListService;

import java.util.*;

@Controller
public class EstateController {
	@Autowired
	private EstateService service;
	
	@Autowired
	private MyEstateListService myEstateService;
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/estate_register")
	public String estateRegister() {
		return "estateRegister";
			
	}
	
	@GetMapping("/available_estates")
	public ModelAndView getAllEstates() {
		List<Estate>list=service.getAllEstates();
	
		return new ModelAndView("estateList","estate",list);
	}  
	
	@PostMapping("/save")
	public String addEstate(@ModelAttribute Estate e) {
		service.save(e);
		return "redirect:/available_estates";
		
	}
	
	@GetMapping("/my_estates")
	public String getMyEstates(Model model) {
		List<MyEstateList> list=myEstateService.getAllMyEstates();
		model.addAttribute("estate",list);
		return "myEstates";
				
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {
		Estate e=service.getEstateById(id);
		MyEstateList me=new MyEstateList(e.getId(),e.getType(),e.getSquareMeter(),e.getNumberofRooms(),e.getNumberofFloors(),e.getFloor(),e.getWarmingType());
		myEstateService.saveMyEstates(me);
		return "redirect:/my_estates";
	}
	
	
	

}
