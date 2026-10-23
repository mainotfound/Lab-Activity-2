
public class Main {

    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
        System.out.println("Age: " + vehicle.calculateAge() + " years");
        System.out.println("Is Vintage? " + vehicle.isVintage());
    }

    public static void main(String[] args) {

        // DEMO 1: Parent reference holding child objects
        System.out.println("=== 1. Parent Reference ===");

        Vehicle vehicle = new Car("Toyota", "Corolla", 2018, 4);
        printDetails(vehicle);

        System.out.println();

        vehicle = new Truck("Ford", "F-150", 2020, 6);
        printDetails(vehicle);

        System.out.println();

        vehicle = new Motorcycle("Yamaha", "Tmax V3", 2026,
                                 "Basta Modagan");
        printDetails(vehicle);


        // DEMO 2: Method Parameter
        System.out.println("\n=== 2. Method Parameter ===");

        printDetails(new Car("Toyota", "Corolla", 2018, 4));
        System.out.println();

        printDetails(new Truck("Ford", "F-150", 2020, 6));
        System.out.println();

        printDetails(new Motorcycle("Yamaha", "Tmax V3", 2026,
                                   "Basta Modagan"));


        // DEMO 3: Polymorphic Array
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Toyota", "Corolla", 2018, 4),
            new Car("Tesla", "Model 3", 2023, 4),
            new Car("Ford", "Mustang", 1969, 2),
            new Truck("Ford", "F-150", 2020, 6),
            new Motorcycle("Yamaha", "Tmax V3", 2026,
                           "Basta Modagan")
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\n--- Vehicle " + (i + 1) + " ---");
            printDetails(vehicles[i]);
        }
    }
}
