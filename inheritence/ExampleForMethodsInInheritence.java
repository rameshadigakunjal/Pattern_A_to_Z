package inheritence;


class Plane {
    // Common methods inherited by all subclasses
    public void takeoff() {
        System.out.println("Plane is taking off with minimum runway required");
    }

    public void land() {
        System.out.println("Plane is landing smoothly on the runway");
    }

    // Method to be overridden for specific behavior
    public void fly() {
        System.out.println("Plane is flying");
    }
}

// Subclass specializing in cargo transport
class CargoPlane extends Plane {
    // Overriding the fly() method for specific behavior
    @Override
    public void fly() {
        System.out.println("Plane is flying at low heights");
    }
}

// Subclass specializing in passenger transport
class PassengerPlane extends Plane {
    // Overriding the fly() method for specific behavior
    @Override
    public void fly() {
        System.out.println("Plane is flying at medium heights");
    }
}

public class ExampleForMethodsInInheritence {

	public static void main(String[] args) {
		// Create an object of CargoPlane
        CargoPlane cp = new CargoPlane();

        // Create an object of PassengerPlane
        PassengerPlane pp = new PassengerPlane();

        // Calling methods on CargoPlane object
        System.out.println("--- CargoPlane Operations ---");
        cp.takeoff(); // Inherited from Plane
        cp.fly();     // Overridden in CargoPlane
        cp.land();    // Inherited from Plane

        System.out.println("\n--- PassengerPlane Operations ---");
        // Calling methods on PassengerPlane object
        pp.takeoff(); // Inherited from Plane
        pp.fly();     // Overridden in PassengerPlane
        pp.land();    // Inherited from Plane
	}

}


