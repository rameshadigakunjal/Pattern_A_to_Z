package AggregationAndComposition;


class Os {
    private String name;
    private int size; // e.g., size in MB or GB
    
    // Constructor
    public Os(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getSize() {
        return size;
    }
}
class Charger {
    private String brand;
    private int voltage; // e.g., voltage in Volts
    
    // Constructor
    public Charger(String brand, int voltage) {
        this.brand = brand;
        this.voltage = voltage;
    }
    
    // Getter methods
    public String getBrand() {
        return brand;
    }
    
    public int getVoltage() {
        return voltage;
    }
}
class Mobile {
    // Composition (Strong Has-A): OS is typically created and managed by the Mobile.
    // An OS usually can't exist meaningfully without the device it runs on.
    Os os = new Os("Android", 512); 
    
    // Aggregation (Weak Has-A): The Mobile uses a Charger, but the Charger
    // can exist independently and be used by other devices.
    void hasA(Charger c) {
        System.out.println("Using Charger Brand: " + c.getBrand());
        System.out.println("Charger Voltage: " + c.getVoltage());
    }
}

public class ExampleForAggregationandComposition {

	public static void main(String[] args) {
		Charger c =new Charger("Onepluse", 5);
		Mobile m = new Mobile();
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		
		m = null;
		System.out.println(c.getBrand());
		System.out.println(c.getVoltage());
	}

}

