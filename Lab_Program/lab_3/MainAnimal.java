package Lab_Program.lab_3;
// multilevel inheritance
class Animal{
	void makeSound() {
		System.out.println("animal make sound");
	}
}
// sub class 1
class cat extends Animal{
	void makeSound() {
		System.out.println("Cat make meows");
	}
}
//sub class 2
class Dog extends Animal{
	void makeSound() {
		System.out.println("dog make bark");
	}
}
public class MainAnimal {
	public static void main(String[] args) {
		Animal a= new Animal();
		//call the Animal class
		a.makeSound();
		
		cat c=new cat();
		//call the cat class
		c.makeSound();
		
		Dog g= new Dog();
		//call the Dog class
		g.makeSound();
	}

}
