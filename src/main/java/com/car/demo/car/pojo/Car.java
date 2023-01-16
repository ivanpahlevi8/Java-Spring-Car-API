package com.car.demo.car.pojo;

import java.util.UUID;

import com.car.demo.car.validation.Age;
import com.car.demo.car.validation.Color;

import jakarta.validation.constraints.NotBlank;

public class Car {
    private String id;
    @NotBlank(message="Car Brand Must Not Blank")
    private String carBrand;
    @NotBlank(message="Car Type Must Not Blank")
    private String carType;
    @NotBlank(message="Car Name Must Not Blank")
    private String carName;
    @Color(message="Car Color Not Valid")
    private String carColor;
    @Age(message="Car Year Not Valid")
    private int carYear;

    public Car() {
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCarBrand() {
        return this.carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return this.carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return this.carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarYear() {
        return this.carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }


}
