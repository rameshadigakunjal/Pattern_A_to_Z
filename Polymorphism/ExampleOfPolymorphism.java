package Polymorphism;

class Plane2 {
    // Common methods inherited by all subclasses
    public void takeoff() {
        System.out.println("Plane is taking off with minimum runway required");
    }

    public void land() {
        System.out.println("Plane is landing smoothly on the runway");
    }

    // Inherited Method: Default behavior
    public void fly() {
        System.out.println("Plane is flying");
    }
}

// Subclass specializing in cargo transport
class CargoPlane2 extends Plane2 {
    // Overriding the fly() method for specific behavior
    @Override
    public void fly() {
        System.out.println("Plane is flying at low heights");
    }
    
    // Specialised method (only in CargoPlane2)
    public void carryCargo() {
        System.out.println("Cargo Plane carries heavy goods and materials.");
    }
}

// Subclass specializing in passenger transport
class PassengerPlane2 extends Plane2 {
    // Overriding the fly() method for specific behavior
    @Override
    public void fly() {
        System.out.println("Plane is flying at medium heights");
    }
}

public class ExampleOfPolymorphism {

	public static void main(String[] args) {
		
		CargoPlane2 cp = new CargoPlane2();
        PassengerPlane2 pp = new PassengerPlane2();

        // Plane reference variable
        Plane2 ref; 

        System.out.println("--- Using Plane reference for CargoPlane ---");
        ref = cp; // ref points to CargoPlane2 object
        ref.takeoff();
        ref.fly(); 
        ref.land();
        
        // Downcasting and calling the specialised method (Safe here, as ref holds cp)
        ((CargoPlane2)ref).carryCargo(); 

        System.out.println("\n--- Using Plane reference for PassengerPlane ---");
        ref = pp; // ref now points to PassengerPlane2 object
        ref.takeoff();
        ref.fly(); 
        ref.land();
        
        // NOTE: If you tried ((CargoPlane2)ref).carryCargo() here, 
        // it would throw a ClassCastException at runtime!
	}
}
