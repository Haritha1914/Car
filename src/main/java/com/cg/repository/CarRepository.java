package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{

}
