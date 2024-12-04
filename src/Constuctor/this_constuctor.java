package Constuctor;

class demo6 {

	demo6() {

		System.out.println("In default Constructor");

	}

	demo6(String s) {
		this();
		System.out.println(s);
	}

	demo6(int n) {

		this("PP");
		System.out.println("In Parameterised Constructor");
	}

}

public class this_constuctor {

	public static void main(String[] args) {
		demo6 obj = new demo6(5);
	}
}