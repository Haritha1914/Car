package com.cg.dao;

import java.util.List;

import com.cg.entity.Car;

public interface CarDao {
	public String addCar(Car car);
	List<Car> getCarList();
}
