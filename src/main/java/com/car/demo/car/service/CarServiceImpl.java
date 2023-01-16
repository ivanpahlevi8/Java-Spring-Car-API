package com.car.demo.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.demo.car.exception.CarStringNotFound;
import com.car.demo.car.exception.CarYearNotFound;
import com.car.demo.car.pojo.Car;
import com.car.demo.car.repository.CarRepository;

@Repository
public class CarServiceImpl implements CarService {

    @Autowired
    CarRepository repository;

    @Override
    public void addCar(Car car) {
        // TODO Auto-generated method stub
        repository.addCar(car);
    }

    @Override
    public Car getCarById(String id) {
        // TODO Auto-generated method stub
        int index = findIndexByCarId(id);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car getCarByCarBrand(String carBrand) {
        // TODO Auto-generated method stub
        int index = findIndexByCarBrand(carBrand);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car getCarByCarType(String carType) {
        // TODO Auto-generated method stub
        int index = findIndexByCarType(carType);
        Car carGet = repository.getCarById(index);
        return carGet;
    }

    @Override
    public Car getCarByCarName(String carName) {
        // TODO Auto-generated method stub
        int index = findIndexByCarName(carName);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car getCarByCarColor(String carColor) {
        // TODO Auto-generated method stub
        int index = findIndexByCarColor(carColor);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car getCarByCarYear(int carYear) {
        // TODO Auto-generated method stub
        int index = findIndexByCarYear(carYear);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarById(String id, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarId(id);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarByCarBrand(String carBrand, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarBrand(carBrand);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarByCarType(String carType, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarType(carType);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarByCarName(String carName, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarName(carName);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarByCarColor(String carColor, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarColor(carColor);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car updateCarByCarYear(int carYear, Car car) {
        // TODO Auto-generated method stub
        int index = findIndexByCarYear(carYear);
        repository.updateCar(index, car);
        Car getCar = repository.getCarById(index);
        return getCar;
    }

    @Override
    public Car deleteCarById(String id) {
        // TODO Auto-generated method stub
        int index = findIndexByCarId(id);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public Car deleteCarByCarBrand(String carBrand) {
        // TODO Auto-generated method stub
        int index = findIndexByCarBrand(carBrand);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public Car deleteCarByCarType(String carType) {
        // TODO Auto-generated method stub
        int index = findIndexByCarType(carType);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public Car deleteCarByCarName(String carName) {
        // TODO Auto-generated method stub
        int index = findIndexByCarName(carName);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public Car deleteCarByCarColor(String carColor) {
        // TODO Auto-generated method stub
        int index = findIndexByCarColor(carColor);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public Car deleteCarByCarYear(int carYear) {
        // TODO Auto-generated method stub
        int index = findIndexByCarYear(carYear);
        Car getCar = repository.getCarById(index);
        repository.deleteCar(index);
        return getCar;
    }

    @Override
    public List<Car> getAllCar() {
        // TODO Auto-generated method stub
        return repository.getAllCar();
    }

    // private methode
    private int findIndexByCarId(String id){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getId().equals(id)){
                break;
            }
            index = index + 1;
        }

        return index;
    }

    private int findIndexByCarBrand(String carBrand){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getCarBrand().equals(carBrand)){
                break;
            }
            index = index + 1;
        }

        return index;
    }

    private int findIndexByCarType(String carType){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getCarType().equals(carType)){
                break;
            }
            index = index + 1;
        }

        return index;
    }

    private int findIndexByCarName(String carName){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getCarName().equals(carName)){
                break;
            }
            index = index + 1;
        }

        if(index == allCar.size()){
            throw new CarStringNotFound(carName);
        }else{
            return index;
        }
    }

    private int findIndexByCarColor(String carColor){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getCarColor().equals(carColor)){
                break;
            }
            index = index + 1;
        }

        if(index == allCar.size()){
            throw new CarStringNotFound(carColor);
        }else {
            return index;
        }
    }

    private int findIndexByCarYear(int carYear){
        List<Car> allCar = repository.getAllCar();
        int index = 0;
        for(Car car : allCar){
            if(car.getCarYear() == carYear){
                break;
            }
            index = index + 1;
        }
        if(index == allCar.size()){
            throw new CarYearNotFound(carYear);
        }else{
            return index;
        }
    }
    
}
