package inheritence;



// Abstract superclass for all types of planes
abstract class Plane1 {

    // Inherited Method: Common functionality used without modification
    public void takeoff() {
        System.out.println("Plane is taking off with minimum runway required");
    }

    // Inherited Method: Common functionality used without modification
    public void land() {
        System.out.println("Plane is landing smoothly on the runway");
    }

    // Specialized Method: Must be defined (implemented) by subclasses
    public abstract void fly();
}

// Subclass specializing in cargo transport
class CargoPlane1 extends Plane1 {
    // Implementing the specialized abstract method (Method Overriding)
    @Override
    public void fly() {
        System.out.println("Plane is flying at low heights");
    }
}

// Subclass specializing in passenger transport
class PassengerPlane1 extends Plane1 {
    // Implementing the specialized abstract method (Method Overriding)
    @Override
    public void fly() {
        System.out.println("Plane is flying at medium heights");
    }
}

// Main class to test the methods
public class ExampleForSpecialzedMethodsInInheritence {
    public static void main(String[] args) {
        // Create an object of CargoPlane1
        CargoPlane1 cp = new CargoPlane1();

        // Create an object of PassengerPlane1
        PassengerPlane1 pp = new PassengerPlane1();

        // Calling methods on CargoPlane object
        System.out.println("--- CargoPlane Operations ---");
        cp.takeoff(); 
        cp.fly();     // Calls CargoPlane1's specialized fly()
        cp.land();    

        System.out.println("\n--- PassengerPlane Operations ---");
        // Calling methods on PassengerPlane object
        pp.takeoff(); 
        pp.fly();     // Calls PassengerPlane1's specialized fly()
        pp.land();    
    }
}

