package Constuctor;

class demo5 {
	

	void get1() {

		System.out.println("In get1");

	}

	void get2() {

		System.out.println("In get2");
		this.get1();
		get1();	

	}

	void get3() {


		System.out.println("In get3");
		this.get2();

	}

}

public class this_methods {

	public static void main(String[] args) {
		demo5 obj = new demo5();
		obj.get3();

	}

}
