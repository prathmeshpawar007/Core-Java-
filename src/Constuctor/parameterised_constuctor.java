package Constuctor;

class demo1 {

	demo1() {

		System.out.println("In default constuctor");
	}

	demo1(int b, String s) {
		System.out.println("In parameterised Constructor with two parameter");
		System.out.println(b);
		System.out.println(s);

	}

	demo1(int a, char c, String s) {

		System.out.println("In parameterised Constructor with three parameter");
		System.out.println(a);
		System.out.println(c);

	}

}

public class parameterised_constuctor {

	public static void main(String[] args) {

		demo1 obj1 = new demo1();
		demo1 obj2 = new demo1(20, "PP");
		demo1 obj3 = new demo1(2, 'A', "PP");

	}

}
