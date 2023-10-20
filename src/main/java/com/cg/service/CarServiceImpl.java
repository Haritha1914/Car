package com.cg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CarDao;
import com.cg.entity.Car;
import com.cg.repository.CarRepository;

@Service
public class CarServiceImpl implements CarDao{

	@Autowired
	private CarRepository cr;
	
	public String addCar(Car car) {
		cr.save(car);
		
		return "Car Added";
	}

	
	public List<Car> getCarList() {
		return cr.findAll();
	}
	
}
