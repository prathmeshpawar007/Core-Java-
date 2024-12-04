package Constuctor;

class one12 {

	one12() {
		System.out.println("In Constructor of one12");
	}

}

class two23 extends one12 {

	two23(int n) {
		super();

		System.out.println("In Constructor of two23");
	}

}

public class super_constructor {

	public static void main(String[] args) {
		two23 obj = new two23(10);

	}

}
