package Abstraction;

abstract class demo {

	abstract void get();

	void show() {
		System.out.println("In show");

	}

}

class demo1 extends demo {
	void get() {
		System.out.println("In get");

	}

}

public class Simple_Abstraction {

	public static void main(String[] args) {

		demo1 obj = new demo1();
		obj.get();
		obj.show();

	}

}
