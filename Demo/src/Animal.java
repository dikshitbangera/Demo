
public class Animal {
	
	public Animal() {
		System.out.println("Animal Creation");
	}
	void eat() {
		System.out.println("eat");
	}
	void work() {
		System.out.println("work");
	}
}
class Dog extends Animal{
	public Dog() {
		super();
		System.out.println("Dog");
	}
	void eat() {
		System.out.println("Eating food");
	}
	void work() {
		super.eat();
	}
}


