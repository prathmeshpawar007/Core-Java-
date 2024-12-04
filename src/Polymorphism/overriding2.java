package Polymorphism;

class AA {
	int a = 10;

	public void show() {
		System.out.println("In class AA show method");
		System.out.println(a);
	}

}

public class overriding2 extends AA {

	public void show() {
		super.show();
		System.out.println("In class overriding show");

	}

	public static void main(String[] args) {

		overriding2 obj = new overriding2();
		obj.show();

	}

}
