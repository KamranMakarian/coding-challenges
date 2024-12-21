public class Main {

    /*Exercise 2: Animal Hierarchy with Inheritance and Overloading
Task:
You’ll create an animal hierarchy to explore inheritance and method overloading. The base class will be Animal, and you’ll define specific types of animals (like Dog and Cat) that inherit from it.

Requirements:
Create a base class Animal with the following:

Properties:
String name: the animal’s name.
int age: the animal’s age.
Constructor: Initialize the name and age of the animal.
Method speak() (no parameters): Prints a generic message like "Animal makes a sound."
Create subclasses that inherit from Animal:

Dog:
Override speak() to print "Dog barks".
Add an overloaded speak(int times) method that allows the dog to bark multiple times.
Cat:
Override speak() to print "Cat meows".
Add an overloaded speak(int times) method to make the cat meow multiple times.
Demonstrate usage in the main method:

Create a few animals of type Dog and Cat.
Call speak() on each animal to see polymorphism in action.
Call the overloaded speak(int times) method on each animal to see method overloading in action.

Steps:
Define the Animal class as the base class with properties and a simple speak() method.
Define the Dog and Cat classes as subclasses of Animal, each with its own implementation of speak() and an overloaded speak(int times) method.
Use Inheritance and Overloading:
Use method overriding for the basic speak() method in each subclass.
Use method overloading to add an additional speak(int times) method in each subclass.
In the main method:
Create a Dog and Cat object.
Demonstrate polymorphism by calling speak() on each object.
Demonstrate overloading by calling speak(int times) with different values.*/

    public static void main(String[] args) {
        // Generic Animal
        System.out.println("Generic Animal:");
        Animal genericAnimal = new Animal("Generic", 5);
        genericAnimal.speak();

        // Dog
        System.out.println("\nDog:");
        Dog myPet1 = new Dog("Joe", 2);
        myPet1.speak();            // Single bark
        myPet1.speak(3);           // Bark multiple times

        // Cat
        System.out.println("\nCat:");
        Cat myPet2 = new Cat("Puss", 3);
        myPet2.speak();            // Single meow
        myPet2.speak(2);           // Meow multiple times
    }
}