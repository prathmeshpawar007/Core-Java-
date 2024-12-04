package Polymorphism;

class A {

	public void show() {

		System.out.println("In class A show");
	}

}

public class Overriding extends A {
	public void show() {

		super.show();
		System.out.println("In class overriding show");
	}

	public static void main(String[] args) {
		Overriding obj = new Overriding();
		obj.show();

	}

}
