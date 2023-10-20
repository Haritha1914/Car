package com.cg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Car;
import com.cg.service.CarServiceImpl;


 

@RestController
@RequestMapping("/carapi")
public class CarController {
	
	private CarServiceImpl cs;
	
	@PostMapping("/add")
	public String addCar(@RequestBody Car car)
	{
		return cs.addCar(car);
	}
	
	@GetMapping("/")
	public List<Car> getAllCars(){
		return cs.getCarList();
	}
}
