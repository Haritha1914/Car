package com.cg.service;
import java.util.ArrayList;
import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 

import com.cg.entity.Car;
import com.cg.repository.CarRepository;

@Service
public class CarServiceImpl {
	@Autowired
	CarRepository carRepository;
	public void saveOrUpdate(Car car) {
		carRepository.save(car);
	}

	public Car getcarByRegnum(int regnum) {
		return carRepository.findById(regnum).get();
	} 
	public List<Car> getAllCar()   
	{  
	List<Car> car = new ArrayList<Car>();  
	carRepository.findAll().forEach(car1 -> car.add(car1));  
	return car;  
	}  
}
