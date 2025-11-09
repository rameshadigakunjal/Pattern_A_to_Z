package inheritence;


// multilevel inheritance
class Animal{
	void makeSound() {
		System.out.println("animal make sound");
	}
}

class cat extends Animal{
	void makeSound() {
		System.out.println("Cat make meows");
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("dog make bark");
	}
}
public class MainAnimal {

	public static void main(String[] args) {
		Animal a= new Animal();
		
		a.makeSound();
		
		cat c=new cat();
		c.makeSound();
		
		Dog g= new Dog();
		g.makeSound();
	}

}
