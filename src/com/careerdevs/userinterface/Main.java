package com.careerdevs.userinterface;

import java.util.Scanner;

public class Main {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Car carDetails1 = new Car("Honda", "Accord");
        Car carDetails2 = new Car("Lexus", "Ex300");
        Car carDetails3 = new Car("Mercedes", "CL300");

        RentalService carStorage = new RentalService("Jay's Car Dealer");

        carStorage.availableCars.add(carDetails1);
        carStorage.availableCars.add(carDetails2);
        carStorage.availableCars.add(carDetails3);

        System.out.println("--------------------");

        System.out.println(carStorage.name);

        System.out.println("--------------------");

        String carSelection;
        String carReturn;

        while(true) {
            System.out.println("(1) Book a car");
            System.out.println("(2) Return a car");
            System.out.println("(3) Exit the dealerShip");
            System.out.println("Please select your menu by entering a number from 1 - 3");

            int userNum = userInput.nextInt();
            userInput.nextLine();

            if(userNum == 1) {
                System.out.println("Enter a car name to select the car you'd like to rent" );
                carStorage.showInventory();

                carSelection = userInput.nextLine();

                carStorage.bookedCar(carSelection);
                System.out.println();

                System.out.println("Available  cars: \n" + carStorage.availableCars);

                System.out.println("Thank you! You are now renting the " + carSelection + " car.");
                System.out.println();

            }

            else if(userNum == 2) {
                System.out.println("Return a car:");
                carReturn = userInput.nextLine();

                carStorage.returnCar(carReturn);

                System.out.println("Available  cars: \n" + carStorage.availableCars);

            }
            else if(userNum == 3) {
                System.out.println("Leaving the dealership");
                break;
            }
        }
    }
}
