package com.careerdevs;

public class RentalService {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Rental CLI");

        System.out.println("-----------------------");

        Car carDetail = new Car("honda", "Civic", true);
        System.out.println(carDetail);
    }
}
