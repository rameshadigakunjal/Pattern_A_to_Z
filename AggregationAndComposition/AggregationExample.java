    package AggregationAndComposition;

// aggregation classes
class Bike{
	private String brand;
	private int mileage;
	
	public Bike(String brand, int mileage) {
		this.brand = brand;
		this.mileage = mileage;
	}
	public String getBrand() {
		return brand;
	}
	public int getMileage() {
		return mileage;
	}
}
class Book{
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	public  String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
}

// composition classes

class Heart{
	private int weight;
	private int bpm;
	
	public Heart(int weight, int bpm) {
		this.weight = weight;
		this.bpm = bpm;
	}
	public int getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
	
	public void showHeartDetails() {
		System.out.println("Heart Weight: "+ weight + "grams");
		System.out.println("Heart Bpm: "+ bpm);
	}
	
}

class Brain{
	private int weight;
	private String color;
	
	public Brain(int weight, String color) {
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
	
	public void showBrainDetails() {
		System.out.println("Brain Weight: "+ weight);
		System.out.println("Brain Colour:  "+ color);
	}
}

//student class

class Student{
	//composition
	private Heart heart = new Heart(350, 70);
	private Brain brain = new Brain(1400, "greay");
	
	//aggregation methods
	public void hasA(Bike b, Book bk) {
		System.out.println("Bike Brand: "+b.getBrand());
		System.out.println("Bike Mileage: "+b.getMileage());
		System.out.println("Book Name: "+bk.getName());
		System.out.println("Book Author: "+bk.getAuthor());

	}
	public void showStudentOrgans() {
		heart.showHeartDetails();
		brain.showBrainDetails();
	}
	
}


public class AggregationExample {

	public static void main(String[] args) {
		Bike bike = new Bike("yamaha", 50);
		Book book = new Book("java programming", "james Gosling");
		
		Student student = new Student();
		// showing Aggregation
		student.hasA(bike, book);
		
		//showing composition
		student.showStudentOrgans();
		
		student = null;
		
		System.out.println("Bike still Exists: "+ bike.getBrand());
		System.out.println("Book still Exists: "+ book.getName());
		
	}

}
