package com.Estate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myrealestate")
public class MyEstateList {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="type")
	private String type;
	public MyEstateList(int id, String type, int squareMeter, String numberofRooms, int numberofFloors, int floor,
			String warmingType) {
		super();
		this.id = id;
		this.type = type;
		this.squareMeter = squareMeter;
		this.numberofRooms = numberofRooms;
		this.numberofFloors = numberofFloors;
		this.floor = floor;
		this.warmingType = warmingType;
	}
	@Column(name="squareMeter")
	private int squareMeter;
	@Column(name="numberofRooms")
	private String numberofRooms;
	@Column(name="numberofFloors")
	private int numberofFloors;
	@Column(name="floor")
	private int floor;
	@Column(name="warmingType")
	private String warmingType;
	public MyEstateList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSquareMeter() {
		return squareMeter;
	}
	public void setSquareMeter(int squareMeter) {
		this.squareMeter = squareMeter;
	}
	public String getNumberofRooms() {
		return numberofRooms;
	}
	public void setNumberofRooms(String numberofRooms) {
		this.numberofRooms = numberofRooms;
	}
	public int getNumberofFloors() {
		return numberofFloors;
	}
	public void setNumberofFloors(int numberofFloors) {
		this.numberofFloors = numberofFloors;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getWarmingType() {
		return warmingType;
	}
	public void setWarmingType(String warmingType) {
		this.warmingType = warmingType;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
