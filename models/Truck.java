package models;

import interfaces.Serviceable;

public class Truck extends Vehicle implements Serviceable {

    int wheels;

    public Truck(String brand, String model, int year, int wheels) {
        super(brand, model, year);
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels: " + wheels);
    }

    @Override
    public void moveForward() {
        System.out.println("A truck moves forward");
    }

    @Override
    public void moveBackwards() {
        System.out.println("A truck moves backwards");
    }

    @Override
    public void moveLeft() {
        System.out.println("A truck moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A truck moves right");
    }

    @Override
    public void service() {
        System.out.println("Truck: inspect cargo brakes.");
    }
}