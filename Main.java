// Define the Car class
class Car {
    // Attributes (Fields) of the Car class
    String make;
    String model;
    int year;

    // Constructor to initialize the object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call the displayInfo method on each object
        car1.displayInfo();  // Output: 2020 Toyota Corolla
        car2.displayInfo();  // Output: 2022 Honda Civic
    }
}
