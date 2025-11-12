package Abstraction;

// Abstract Class: A restricted class that cannot be used to create objects,
// but must be inherited by another class.
// It defines the contract (abstract methods) that all derived shapes must follow.
abstract class Shape {
    // Abstract Method: Declared without a body. It must be implemented (defined)
    // by any non-abstract subclass.
    abstract void CalculateArea();
    
    // Abstract Method: Must be implemented by subclasses.
    abstract void display();
}

// Concrete Subclass: Inherits from the abstract superclass 'Shape'.
class Square extends Shape {
    double side;
    
    // Constructor
    Square(double side) {
        this.side = side;
    }
    
    // Implementation of the abstract method CalculateArea() (Method Overriding).
    // This provides the specific behavior for a Square.
    @Override
    void CalculateArea() {
        System.out.println("Calculating the area of square..");
    }
    
    // Implementation of the abstract method display() (Method Overriding).
    @Override
    void display() {
        double area = side * side;
        System.out.println("Area of square: " + area);
    }
}

// Concrete Subclass: Inherits from the abstract superclass 'Shape'.
class Rectangle extends Shape {
    double length, breadth;
    
    // Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    // Implementation of the abstract method CalculateArea() (Method Overriding).
    // This provides the specific behavior for a Rectangle.
    @Override
    void CalculateArea() {
        System.out.println("Calculating area of rectangle..");
    }
    
    // Implementation of the abstract method display() (Method Overriding).
    @Override
    void display() {
        double area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}

// Main class to demonstrate Polymorphism.
public class ExampleForShape {
    
    // Method demonstrating Polymorphism:
    // 'ref' is a Parent type reference (Shape) but can accept any Child type object (Square or Rectangle).
    // At runtime, the correct CalculateArea() and display() method is invoked based on the actual object type
    // (Runtime Polymorphism / Dynamic Method Dispatch).
    void allow(Shape ref) {
        ref.CalculateArea();
        ref.display();
    }

    public static void main(String[] args) {
        // Create objects of the concrete subclasses.
        Square s = new Square(5);
        Rectangle r = new Rectangle(5, 2);
        
        // Create an object of the demonstration class.
        ExampleForShape e = new ExampleForShape();
        
        // Call 'allow' with a Square object. 'ref' acts as a Square.
        e.allow(s);
        
        // Call 'allow' with a Rectangle object. 'ref' acts as a Rectangle.
        e.allow(r);
    }
}