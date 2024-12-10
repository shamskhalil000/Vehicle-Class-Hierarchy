// Define the Vehicle class
class Vehicle {
    // Properties
    private String make;
    private String model;
    private int year;

    // Constructor to initialize properties
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void printDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of the Vehicle class
        Vehicle car1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle car2 = new Vehicle("Honda", "Civic", 2018);
        Vehicle car3 = new Vehicle("Ford", "Mustang", 2022);

        // Call printDetails() on each object
        car1.printDetails();
        car2.printDetails();
        car3.printDetails();
    }
}
