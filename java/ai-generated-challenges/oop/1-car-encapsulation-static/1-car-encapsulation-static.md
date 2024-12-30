# Exercise 1: Car Class with Encapsulation and Static Methods

### Task
Create a `Car` class that encapsulates data about a car and provides both instance and static methods for interacting with it.

---

## Requirements

### **Create a Car Class**

#### **Private Fields**
- `String make`: The car's make (e.g., "Toyota").
- `String model`: The car's model (e.g., "Corolla").
- `int year`: The year the car was manufactured.
- `double speed`: The car's current speed (in km/h).

### **Encapsulation with Getters and Setters**
- Provide public **getter methods** for all fields.
- Provide public **setter methods** for the `speed` field:
  - Ensure the speed cannot be negative. If the value is negative, set the speed to `0`.

### **Static Method**
- `convertKmToMiles(double km)`: A static method that takes a distance in kilometers and returns the equivalent distance in miles.
  - Use the conversion rate: `1 km = 0.621371 miles`.

### **Instance Methods**
- `accelerate(double amount)`: Increases the speed by the given amount.
- `brake(double amount)`: Reduces the speed by the given amount (speed cannot go below `0`).

---

## Main Method
1. Create a few `Car` objects and manipulate their speed.
2. Use the static method `convertKmToMiles` to convert the speed to miles and display it.
