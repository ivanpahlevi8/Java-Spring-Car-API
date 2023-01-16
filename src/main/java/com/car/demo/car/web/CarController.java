package com.car.demo.car.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.demo.car.pojo.Car;
import com.car.demo.car.service.CarService;

import jakarta.validation.Valid;

@RestController
public class CarController {
    @Autowired
    CarService carService;

    @PostMapping("/car")
    public ResponseEntity<HttpStatus> addCar( @Valid @RequestBody Car car){
        carService.addCar(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
    @GetMapping("/getcarid/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable String id){
        Car carGet = carService.getCarById(id);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @GetMapping("/getcarbrand/{brand}")
    public ResponseEntity<Car> getCarByBrand(@PathVariable String brand){
        Car carGet = carService.getCarByCarBrand(brand);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @GetMapping("/getcartype/{type}")
    public ResponseEntity<Car> getCarByType(@PathVariable String type){
        Car carGet = carService.getCarByCarType(type);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @GetMapping("/getcarname/{name}")
    public ResponseEntity<Car> getCarByName(@PathVariable String name){
        Car carGet = carService.getCarByCarName(name);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @GetMapping("/getcarcolor/{color}")
    public ResponseEntity<Car> getCarColor(@PathVariable String color){
        Car carGet = carService.getCarByCarColor(color);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @GetMapping("/getcaryear/{year}")
    public ResponseEntity<Car> getCarYear(@PathVariable int year){
        Car carGet = carService.getCarByCarYear(year);
        return new ResponseEntity<>(carGet, HttpStatus.OK);
    }

    @PutMapping("/putcarid/{id}")
    public ResponseEntity<Car> putCarId(@PathVariable String id, @Valid @RequestBody Car car){
        Car carGet = carService.updateCarById(id, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @PutMapping("/putcarbrand/{brand}")
    public ResponseEntity<Car> putCarBrand(@PathVariable String brand, @RequestBody Car car){
        Car carGet = carService.updateCarByCarBrand(brand, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @PutMapping("/putcartype/{type}")
    public ResponseEntity<Car> putCarType(@PathVariable String type, @RequestBody Car car){
        Car carGet = carService.updateCarByCarType(type, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @PutMapping("/putcarname/{name}")
    public ResponseEntity<Car> putCarName(@PathVariable String name, @RequestBody Car car){
        Car carGet = carService.updateCarByCarName(name, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @PutMapping("/putcarcolor/{color}")
    public ResponseEntity<Car> putCarColor(@PathVariable String color, @RequestBody Car car){
        Car carGet = carService.updateCarByCarColor(color, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @PutMapping("/putcaryear/{year}")
    public ResponseEntity<Car> putCarYear(@PathVariable int year, @RequestBody Car car){
        Car carGet = carService.updateCarByCarYear(year, car);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecarid/{id}")
    public ResponseEntity<Car> deleteCarId(@PathVariable String id){
        Car carGet = carService.deleteCarById(id);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecarbrand/{brand}")
    public ResponseEntity<Car> deleteCarBrand(@PathVariable String brand){
        Car carGet = carService.deleteCarByCarBrand(brand);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecartype/{type}")
    public ResponseEntity<Car> deleteCarType(@PathVariable String type){
        Car carGet = carService.deleteCarByCarType(type);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecarname/{name}")
    public ResponseEntity<Car> deleteCarName(@PathVariable String name){
        Car carGet = carService.deleteCarByCarName(name);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecarcolor/{color}")
    public ResponseEntity<Car> deleteCarColor(@PathVariable String color){
        Car carGet = carService.deleteCarByCarColor(color);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletecaryear/{year}")
    public ResponseEntity<Car> deleteCarYear(@PathVariable int year){
        Car carGet = carService.deleteCarByCarYear(year);
        return new ResponseEntity<>(carGet, HttpStatus.CREATED);
    }
}
