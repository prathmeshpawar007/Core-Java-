package Inheritance;

class parent1 {

	void get() {

		System.out.println("base class");

	}

}

class child1 extends parent1 {

	void show() {

		System.out.println("derived class");

	}

}

public class single_inheritance {

	public static void main(String[] args) {
		child1 obj = new child1();
		obj.show();
		obj.get();

	}

}
