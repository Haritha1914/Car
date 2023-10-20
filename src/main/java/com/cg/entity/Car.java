package com.cg.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int regnum;
	private String carNumber;  
	private String name;
	public Car(int regnum, String carNumber, String name) {
		super();
		this.regnum = regnum;
		this.carNumber = carNumber;
		this.name = name;
	}
	public Car() {
		
	}
	public int getRegnum() {
		return regnum;
	}
	public void setRegnum(int regnum) {
		this.regnum = regnum;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Car [regnum=" + regnum + ", carNumber=" + carNumber + ", name=" + name + "]";
	}
	
	
	

}
