public abstract class Vehicle {

    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
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

    // Abstract methods to be implemented by all subclasses
    public abstract void moveForward();
    public abstract void moveBackwards();
    public abstract void moveLeft();
    public abstract void moveRight();
}