package OOP_object_creation;

class demo {

	int a;
	int b;

	void get1() {

		System.out.println("Addition : " + (a + b));
	}

	void get2() {
		System.out.println("Substraction : " + (a - b));
	}

	void get3() {

		System.out.println("Division : " + (a / b));
	}

	void get4() {
		System.out.println("Multiplication : " + (a * b));

	}
}

public class calling_method {

	public static void main(String[] args) {

		demo obj = new demo();
		obj.a = 20;
		obj.b = 10;
		obj.get1();
		obj.get2();
		obj.get3();
		obj.get4();

	}

}
