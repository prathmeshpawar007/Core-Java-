package Inheritance;

class Animal {

	void get() {
		System.out.println("This is Animal");
	}

}

class Dog extends Animal {

	void show() {
		System.out.println("Dog");
		System.out.println("Dog eats food");
	}
}

class Cat extends Animal {
	void display() {
		System.out.println("Cat");
		System.out.println("Cat eats food");
	}

}

public class heirarchical_inheritance {

	public static void main(String[] args) {

		Dog obj1 = new Dog();
		obj1.show();
		obj1.get();

		Cat obj = new Cat();
		obj.display();
		obj.get();

	}

}
