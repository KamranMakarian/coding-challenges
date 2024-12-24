## Appliance Control System with Polymorphism and Loose Coupling

### Task:
In this exercise, you’ll create an Appliance Control System that controls different types of appliances. You’ll use polymorphism to create a common interface for all appliances and demonstrate loose coupling by creating a RemoteControl class that can interact with any appliance.

### Requirements:
Create an Appliance interface with the following methods:
- void turnOn(): Turns the appliance on.
- void turnOff(): Turns the appliance off.

Create classes that implement Appliance:    
- WashingMachine: Implements turnOn() and turnOff() with messages like "Washing Machine is now ON" and "Washing Machine is now OFF".
- Refrigerator: Implements turnOn() and turnOff() with messages like "Refrigerator is now ON" and "Refrigerator is now OFF".
- Microwave: Implements turnOn() and turnOff() with messages like "Microwave is now ON" and "Microwave is now OFF".

Create a RemoteControl class: This class should contain a method operateAppliance(Appliance appliance, boolean turnOn):

- If turnOn is true, call appliance.turnOn().
- If turnOn is false, call appliance.turnOff().

This design introduces loose coupling because RemoteControl can operate any Appliance without knowing its specific type.

In the main method: Create objects of each appliance type (WashingMachine, Refrigerator, Microwave).
Use a RemoteControl object to turn each appliance on and off.
This should demonstrate polymorphism, as the RemoteControl interacts with each appliance through the common Appliance interface.