# Exercise 4: Vehicle System with Abstraction

### Task
This exercise explores **abstract classes** and **interfaces** by creating a system for different types of vehicles. You will define an abstract base class `Vehicle` and extend it to specific vehicle types (like `Car` and `Bike`). Additionally, you'll implement an interface for fuel efficiency, demonstrating the use of both abstraction and interfaces in a single exercise.

---

## Requirements

### Create an Abstract Class: Vehicle
- **Properties**:
  - `String make`: The vehicle's make (e.g., "Toyota").
  - `String model`: The vehicle's model (e.g., "Corolla").
- **Constructor**:
  - Initializes the `make` and `model` properties.
- **Abstract Methods**:
  - `void startEngine()`: Starts the vehicle’s engine.
  - `void stopEngine()`: Stops the vehicle’s engine.
- **Concrete Method**:
  - `void displayInfo()`: Prints the make and model of the vehicle.

### Create an Interface: FuelEfficient
- **Methods**:
  - `double calculateFuelEfficiency()`: Calculates the fuel efficiency in kilometers per liter (km/L).

### Create Two Subclasses of Vehicle

#### Car
- **Implements**:
  - `startEngine()` and `stopEngine()` with specific messages like `"Car engine started."`.
  - `calculateFuelEfficiency()` with a basic formula for demonstration.

#### Bike
- **Implements**:
  - `startEngine()` and `stopEngine()` with specific messages like `"Bike engine started."`.
  - `calculateFuelEfficiency()` with a different formula.

---

## In the Main Method
1. Create objects of type `Car` and `Bike`.
2. Call the following methods on each object to demonstrate **polymorphism** and **abstraction**:
   - `startEngine()`
   - `stopEngine()`
   - `displayInfo()`
   - `calculateFuelEfficiency()`
