public class Main {

    /*Exercise: Shape Management System
In this exercise, you’ll create a system to manage different shapes. You’ll define an abstract base class Shape, implement concrete subclasses like Circle and Rectangle, and use an interface Resizable to demonstrate resizing capabilities. The system will use the concepts of inheritance, polymorphism, abstraction, interfaces, and the relationships IS-A, HAS-A, and CAN-DO.

Requirements
1. Create an Abstract Class Shape
Purpose: Shape will be the base class for all shapes.
Properties:
String color (protected, with getter and setter).
Methods:
Abstract Method: double calculateArea().
Abstract Method: double calculatePerimeter().
Concrete Method: void displayInfo(), which prints the shape type, color, and area.
2. Create an Interface Resizable
Purpose: An interface to add resizing capabilities to shapes.
Methods:
void resize(double factor): Resizes the shape by a given factor.
3. Create Subclasses Circle and Rectangle (IS-A relationship)
Circle:
Properties: double radius.
Implements: Resizable.
Overridden Methods:
calculateArea(): Calculates the area of a circle.
calculatePerimeter(): Calculates the perimeter (circumference) of a circle.
Implements resize(double factor) to resize the circle by adjusting its radius.
Overload Constructor:
One with radius and color.
One with only radius, defaulting to a color.
Rectangle:
Properties: double length, double width.
Implements: Resizable.
Overridden Methods:
calculateArea(): Calculates the area of a rectangle.
calculatePerimeter(): Calculates the perimeter of a rectangle.
Implements resize(double factor) to resize the rectangle by adjusting its length and width.
4. Create a ShapeManager Class (HAS-A and CAN-DO relationships)
Purpose: ShapeManager will manage a collection of Shape objects (demonstrates loose coupling).
Properties:
ArrayList<Shape> shapes to hold various shapes.
Methods:
void addShape(Shape shape): Adds a shape to the collection.
void displayAllShapes(): Iterates through all shapes, calling displayInfo() on each (demonstrates polymorphism).
void resizeAllShapes(double factor): Calls resize(factor) on all Resizable shapes.
UML Overview
This is a quick description of how the classes and interfaces relate to each other:

Shape (abstract) is the base class.
Circle and Rectangle are subclasses of Shape and implement Resizable.
ShapeManager contains a list of Shape objects, demonstrating a HAS-A relationship.
Resizable is a CAN-DO relationship, allowing specific shapes to be resized.*/

    public static void main(String[] args) {
        ShapeManager shapeManager = new ShapeManager();

        // Creating shapes
        Circle circle = new Circle(5, "Red");
        Rectangle rectangle = new Rectangle(4, 6, "Blue");

        // Adding shapes to the manager
        shapeManager.addShape(circle);
        shapeManager.addShape(rectangle);

        // Display all shapes
        System.out.println("Displaying all shapes:");
        shapeManager.displayAllShapes();

        // Resize all shapes
        System.out.println("Resizing all shapes by factor of 2:");
        shapeManager.resizeAllShapes(2);

        // Display shapes after resizing
        System.out.println("Displaying all shapes after resizing:");
        shapeManager.displayAllShapes();
    }
}