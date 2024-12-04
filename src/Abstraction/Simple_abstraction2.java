package Abstraction;

abstract class demo12 {

	abstract void fun();

	abstract void gun();

	void add() {

		System.out.println("Concrete method in the class");

	}

}

public class Simple_abstraction2 extends demo12

{
	void fun() {

		System.out.println("In fun");
	}

	void gun() {
		System.out.println("In gun");

	}

	public static void main(String[] args) {

		Simple_abstraction2 obj = new Simple_abstraction2();
		obj.fun();
		obj.gun();
		obj.add();

	}

}
