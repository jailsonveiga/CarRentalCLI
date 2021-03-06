package com.careerdevs;

public class Car {
    public String make;
    public String model;
    public boolean isRented;

    public Car(String make, String model, boolean isRented) {
        this.make = make;
        this.model = model;
        this.isRented = isRented;
    }

    @Override
    public String toString() {
        return  "Car Description: " + "\n" +
                "- Make: " + make + "\n" +
                "- Model: " + model + "\n" +
                "- IsRented: " + isRented;
    }
}
