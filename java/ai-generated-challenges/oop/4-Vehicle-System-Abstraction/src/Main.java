public class Main {

    /*Exercise 4: Vehicle System with Abstraction
This exercise will let you explore abstract classes and interfaces while creating a system for different types of vehicles.

Task:
You will create an abstract base class Vehicle with some general properties and methods, then extend it to specific vehicle types (like Car and Bike). Additionally, you’ll implement an interface for fuel efficiency, demonstrating both abstract classes and interfaces in a single exercise.

Requirements:
Create an Abstract Class Vehicle:

Properties:
String make: the vehicle's make (e.g., "Toyota").
String model: the vehicle's model (e.g., "Corolla").
Constructor: Initialize the make and model.
Abstract Methods:
void startEngine(): to start the vehicle’s engine.
void stopEngine(): to stop the vehicle’s engine.
Concrete Method:
void displayInfo(): prints the make and model of the vehicle.
Create an Interface FuelEfficient:

Methods:
double calculateFuelEfficiency(): calculates the fuel efficiency in kilometers per liter (km/L).
Create Two Subclasses of Vehicle:

Car:
Implements startEngine() and stopEngine() with specific messages like "Car engine started."
Implements calculateFuelEfficiency() with a basic formula for demonstration.
Bike:
Implements startEngine() and stopEngine() with specific messages like "Bike engine started."
Implements calculateFuelEfficiency() with a different formula.
In the main method:

Create objects of type Car and Bike.
Call startEngine(), stopEngine(), displayInfo(), and calculateFuelEfficiency() on each vehicle to demonstrate polymorphism and abstraction.*/

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Corolla", 300, 20);
        Bike bike = new Bike("Honda", "CB500", 200, 5);

        System.out.println("Car Info:");
        car.displayInfo();
        car.startEngine();
        System.out.printf("Fuel Efficiency: " + car.calculateFuelEfficiency() + "km/L");

        System.out.println("\n");

        System.out.println("Bike Info:");
        bike.displayInfo();
        bike.startEngine();
        System.out.printf("Fuel Efficiency: " + bike.calculateFuelEfficiency() + "km/L");

    }
}