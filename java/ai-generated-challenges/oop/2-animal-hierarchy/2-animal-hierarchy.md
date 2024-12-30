# Exercise 2: Animal Hierarchy with Inheritance and Overloading

### Task
You’ll create an animal hierarchy to explore **inheritance** and **method overloading**. The base class will be `Animal`, and you’ll define specific types of animals (like `Dog` and `Cat`) that inherit from it.

---

## Requirements

### **Create a Base Class: Animal**
- **Properties**:
  - `String name`: The animal’s name.
  - `int age`: The animal’s age.
- **Constructor**:
  - Initializes the `name` and `age` of the animal.
- **Method**:
  - `speak()`: Prints a generic message like `"Animal makes a sound."`

### **Create Subclasses that Inherit from Animal**

#### **Dog**
- **Override**:
  - `speak()`: Prints `"Dog barks"`.
- **Overloaded Method**:
  - `speak(int times)`: Allows the dog to bark multiple times.

#### **Cat**
- **Override**:
  - `speak()`: Prints `"Cat meows"`.
- **Overloaded Method**:
  - `speak(int times)`: Allows the cat to meow multiple times.

---

## Demonstrate Usage in the Main Method
1. **Create a few animals** of type `Dog` and `Cat`.
2. **Call `speak()`** on each animal to demonstrate **polymorphism**.
3. **Call the overloaded `speak(int times)`** method on each animal to demonstrate **method overloading**.

---

## Steps

1. **Define the `Animal` class**:
   - Include properties (`name`, `age`) and a simple `speak()` method.
2. **Define the `Dog` and `Cat` classes**:
   - Each subclass should override the `speak()` method.
   - Add an overloaded `speak(int times)` method to each subclass.
3. **Use Inheritance and Overloading**:
   - Use **method overriding** for the basic `speak()` method in each subclass.
   - Use **method overloading** to add the `speak(int times)` method.
4. **In the main method**:
   - Create `Dog` and `Cat` objects.
   - Demonstrate polymorphism by calling `speak()` on each object.
   - Demonstrate overloading by calling `speak(int times)` with different values.
