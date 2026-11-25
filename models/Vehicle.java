package models;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(brand + ", " + model + ", " + year);
    }

    public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }

       public abstract void moveForward();
    public abstract void moveBackwards();
    public abstract void moveLeft();
    public abstract void moveRight();
}