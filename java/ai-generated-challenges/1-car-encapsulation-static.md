## Car Class with Encapsulation and Static Methods

### Task:
You need to create a Car class that encapsulates data about a car and provides both instance and static methods for interacting with it.

### Requirements:
Create a Car class with the following private fields:

- String make: the car's make (e.g., "Toyota").
- String model: the car's model (e.g., "Corolla").
- int year: the year the car was manufactured.
- double speed: the car's current speed (in km/h).
- Encapsulation with Getters and Setters:

    - Provide public getter methods for all fields.
    - Provide public setter methods for the speed field. The setter should:
    - Ensure the speed cannot be negative. If the value is negative, set the speed to 0.

- Static Method: Create a static method convertKmToMiles(double km) that takes a distance in kilometers and returns the equivalent distance in miles (use 1 km = 0.621371 miles).

- Instance Methods:

    - accelerate(double amount): Increase the speed by the given amount.
    - brake(double amount): Reduce the speed by the given amount (speed cannot go below 0).

Main Method: Create a few Car objects and manipulate their speed.
Use the static method convertKmToMiles to convert the speed to miles and display it.