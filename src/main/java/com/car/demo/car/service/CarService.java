package com.car.demo.car.service;

import java.util.List;

import com.car.demo.car.pojo.Car;

public interface CarService {
    public void addCar(Car car);
    public Car getCarById(String id);
    public Car getCarByCarBrand(String carBrand);
    public Car getCarByCarType(String carType);
    public Car getCarByCarName(String carName);
    public Car getCarByCarColor(String carColor);
    public Car getCarByCarYear(int carYear);
    public Car updateCarById(String id, Car car);
    public Car updateCarByCarBrand(String carBrand, Car car);
    public Car updateCarByCarType(String carType, Car car);
    public Car updateCarByCarName(String carName, Car car);
    public Car updateCarByCarColor(String carColor, Car car);
    public Car updateCarByCarYear(int carYear, Car car);
    public Car deleteCarById(String id);
    public Car deleteCarByCarBrand(String carBrand);
    public Car deleteCarByCarType(String carType);
    public Car deleteCarByCarName(String carName);
    public Car deleteCarByCarColor(String carColor);
    public Car deleteCarByCarYear(int carYear);
    public List<Car> getAllCar();
}
