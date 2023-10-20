package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.entity.Car;
import com.cg.service.CarServiceImpl;


 

@RestController
public class CarController {
	@Autowired
	CarServiceImpl service;
	@GetMapping("/car/{regnum}")             
	private Car getcarByRegnum(@PathVariable("regnum") int regnum) {
		return service.getcarByRegnum(regnum);
	}

	@PostMapping("/car")
	private int saveOrUpdate(@RequestBody Car car) {
		service.saveOrUpdate(car);
		return car.getRegnum();
	}   
	@GetMapping("/car")  
	private List<Car> getAllBooks()   
	{  
	return service.getAllCar();  
	}  
}
