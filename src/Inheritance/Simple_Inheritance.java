package Inheritance;

class parent2 {

	void show() {

		System.out.println("parent");
	}

}

class child2 extends parent2 {

	void show() {
		super.show();

		System.out.println("child");
	}
}

public class Simple_Inheritance {

	public static void main(String[] args) {

		child2 obj = new child2();
		obj.show();

	}

}
