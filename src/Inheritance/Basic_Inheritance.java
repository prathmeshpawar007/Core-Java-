package Inheritance;

class parent {

	void get1() {
		System.out.println("In get1");

	}

}

class child extends parent {
	void get2() {

		System.out.println("In get2");

	}

}

public class Basic_Inheritance {

	public static void main(String[] args) {
		child obj = new child();
		obj.get2();
		obj.get1();

	}

}
