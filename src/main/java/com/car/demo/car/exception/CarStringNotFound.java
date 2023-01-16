package com.car.demo.car.exception;

public class CarStringNotFound extends RuntimeException {
    public CarStringNotFound(String msg){
        super("Input :" + msg + " Not Found");
    }
}
