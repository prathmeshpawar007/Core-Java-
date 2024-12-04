package Constuctor;

class demo7 {

	int a;
	int b;

	demo7() {
		a = 10;
		b = 20;
	}

	demo7 get() {        // By this we can return the instance variable of the class
		return this;

	}

	void show() {
		System.out.println(a + b);
	}

}

public class This_keyword1 {

	public static void main(String[] args) {

		demo7 obj = new demo7();
		obj.get();
		obj.show();

	}

}
