package OOP_object_creation;

class demo1 {

	void get() {

		System.out.println("In class demo get");
	}

	void get(int n) {

		System.out.println(n);
	}
}

public class Parameterised_method {

	public static void main(String[] args) {

		demo1 obj = new demo1();
		obj.get();
		obj.get(10);

	}

}
