class Car {
    String make;   // The make of the car (e.g., "Toyota")
    String model;  // The model of the car (e.g., "Corolla")
    int year;      // The year of manufacture (e.g., 2020)
    
    // Method to display the car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Create an instance of the Car class
        Car myCar = new Car();
        
        // Assign values to the car's properties
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Display the car's information using the displayInfo method
        myCar.displayInfo();
    }
}
