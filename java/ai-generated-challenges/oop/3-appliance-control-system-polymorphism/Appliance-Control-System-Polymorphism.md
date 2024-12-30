# Exercise 3: Appliance Control System with Polymorphism and Loose Coupling

### Task
In this exercise, you’ll create an **Appliance Control System** that controls different types of appliances. You’ll use **polymorphism** to create a common interface for all appliances and demonstrate **loose coupling** by creating a `RemoteControl` class that can interact with any appliance.

---

## Requirements

### **Create an Appliance Interface**
- **Methods**:
  - `void turnOn()`: Turns the appliance on.
  - `void turnOff()`: Turns the appliance off.

---

### **Create Classes that Implement Appliance**

#### **WashingMachine**
- Implements `turnOn()` with the message:
  - `"Washing Machine is now ON"`.
- Implements `turnOff()` with the message:
  - `"Washing Machine is now OFF"`.

#### **Refrigerator**
- Implements `turnOn()` with the message:
  - `"Refrigerator is now ON"`.
- Implements `turnOff()` with the message:
  - `"Refrigerator is now OFF"`.

#### **Microwave**
- Implements `turnOn()` with the message:
  - `"Microwave is now ON"`.
- Implements `turnOff()` with the message:
  - `"Microwave is now OFF"`.

---

### **Create a RemoteControl Class**
- **Method**:
  - `operateAppliance(Appliance appliance, boolean turnOn)`:
    - If `turnOn` is `true`, call `appliance.turnOn()`.
    - If `turnOn` is `false`, call `appliance.turnOff()`.

This design introduces **loose coupling** because `RemoteControl` can operate any `Appliance` without knowing its specific type.

---

## In the Main Method
1. Create objects of each appliance type (`WashingMachine`, `Refrigerator`, `Microwave`).
2. Use a `RemoteControl` object to:
   - Turn each appliance on.
   - Turn each appliance off.
3. This demonstrates **polymorphism**, as the `RemoteControl` interacts with each appliance through the common `Appliance` interface.
