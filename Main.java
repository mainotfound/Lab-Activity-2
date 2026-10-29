public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge() + " years");
        System.out.println("Is Vintage? " + vehicle.isVintage());
        
        // Testing the abstract movement methods
        vehicle.moveForward();
        vehicle.moveBackwards();
        vehicle.moveLeft();
        vehicle.moveRight();
    }

    public static void main(String[] args) {

        // DEMO 3: Polymorphic Array testing abstract methods on each subclass
        System.out.println("=== Polymorphic Array with Abstract Methods ===");

        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2018, 4),
            new Truck("Ford", "F-150", 2020, 6),
            new Motorcycle("Yamaha", "Tmax V3", 2026, "Basta Modagan")
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\n--- Vehicle " + (i + 1) + " ---");
            printDetails(vehicles[i]);
        }
    }
}