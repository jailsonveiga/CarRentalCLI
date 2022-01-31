package com.careerdevs.userinterface;

public class Car {
        private String make;
        private String model;

        public Car(String make, String model) {
            this.make = make;
            this.model = model;
        }

    public String getName() {
        return make + " " + model;
    }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    @Override
    public String toString() {
        return
                "make: " + make +
                ", model: " + model;
    }
}
