package com.careerdevs.userinterface;

import java.util.ArrayList;

public class RentalService {
    String name;
    ArrayList<Car> availableCars;
    ArrayList<Car> bookedCars;

    public  RentalService(String name) {
        this.name = name;
        this.availableCars = new ArrayList<>();
        this.bookedCars = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(ArrayList<Car> availableCars) {
        this.availableCars = availableCars;
    }

    public ArrayList<Car> getBookedCars() {
        return bookedCars;
    }

    public void setBookedCars(ArrayList<Car> bookedCars) {
        this.bookedCars = bookedCars;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                        ", availableCars: " + availableCars +
                        ", bookedCars: " + bookedCars;
    }

    public void showInventory() {
        for(int i = 0; i < availableCars.size(); i++) {
            System.out.println("(" + (i + 1) + ") " + availableCars.get(i).getName());
        }

    }

    public void bookedCar(String storeBookedCar) {

        for(int i = 0; i <  availableCars.size(); i++) {
            if(availableCars.get(i).getMake().equals(storeBookedCar)){
                bookedCars.add(availableCars.get(i));
                availableCars.remove(i);
            }
        }
    }

    public void returnCar(String returnRentCar) {
        for(int i = 0; i < bookedCars.size(); i++) {
            if(bookedCars.get(i).getMake().equals(returnRentCar)){
                availableCars.add(bookedCars.get(i));
                bookedCars.remove(i);
                System.out.println(bookedCars);
            }
        }
    }

}
