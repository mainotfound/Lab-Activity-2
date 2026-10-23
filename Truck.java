
public class Truck extends Vehicle {

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
}
