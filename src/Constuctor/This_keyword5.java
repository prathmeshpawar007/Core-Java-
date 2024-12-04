package Constuctor;

public class This_keyword5 {

	int x;

	This_keyword5() {

		System.out.println("In default constructor");
	}

	This_keyword5(int y) {
		
		x = y;

	}

	This_keyword5(This_keyword5 obj) {
		
		System.out.println(obj.x);
	}

	public static void main(String[] args) {

		This_keyword5 obj1 = new This_keyword5();
		This_keyword5 obj2 = new This_keyword5(10);
		This_keyword5 obj3 = new This_keyword5(obj1);

	}

}
