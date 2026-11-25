package models;

import interfaces.Serviceable;

public class Car extends Vehicle implements Serviceable {

    int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + doors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A car moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }

    @Override
    public void service() {
        System.out.println("Car: check oil and brakes.");
    }
}