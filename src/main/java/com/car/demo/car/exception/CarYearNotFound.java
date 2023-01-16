package com.car.demo.car.exception;

public class CarYearNotFound extends RuntimeException {
    public CarYearNotFound(int year){
        super("Year " + year + " Not Found");
    }
}
