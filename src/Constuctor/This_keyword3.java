package Constuctor;

class demo9 {
	int a;
	int b;
	int c;

	demo9() {
		a = 10;
		b = 20;
		c = 40;

	}

	void show() {
		show1(this);
	}

	void show1(demo9 obj) {
		System.out.println(obj.a + obj.b + obj.c);
	}

}

public class This_keyword3 {

	public static void main(String[] args) {
		demo9 obj1 = new demo9();
		obj1.show();

	}

}
