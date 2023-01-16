package com.car.demo.car.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.demo.car.pojo.Car;

@Repository
public class CarRepository {
    // Unoersistance repository
    private List<Car> allCar = new ArrayList<>();

    public void addCar(Car car){
        allCar.add(car);
    }

    public Car getCarById(int index){
        return allCar.get(index);
    }

    public void updateCar(int index, Car car){
        allCar.set(index, car);
    }

    public void deleteCar(int index){
        allCar.remove(index);
    }

    public List<Car> getAllCar(){
        return allCar;
    }
}
