package Abstraction;

abstract class Plane{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}

class CargoPlane extends Plane{
	void takeoff(){
		System.out.println("CargoPlane taking off from the long runway");
	}
	
	void fly() {
		System.out.println("CargoPlane fly at low heights");
	}
	
	void land() {
		System.out.println("CargoPlane is Landing on");
	}
	
}

class PassengerPlane extends Plane{
	void takeoff(){
		System.out.println("PassengerPlane taking off from the long runway");
	}
	
	void fly() {
		System.out.println("PassengerPlane fly at medium heights");
	}
	
	void land() {
		System.out.println("PassengerPlane is Landing on");
	}
	
}

class FighterPlane extends Plane{
	void takeoff(){
		System.out.println("FighterPlane taking off from the long runway");
	}
	
	void fly() {
		System.out.println("FighterPlane fly at great heights");
	}
	
	void land() {
		System.out.println("FighterPlane is Landing on");
	}
	
}





public class ExampleForAbstraction {
	
	void permit( Plane ref)
	{
		ref.takeoff();
		ref.fly();
		ref.land();
	}

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp =new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		ExampleForAbstraction e=new ExampleForAbstraction();
		
		e.permit(fp);
		e.permit(pp);
		e.permit(cp);
		
		
	}

}

