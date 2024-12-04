package Constuctor;

class demo8 {

	int x;

	demo8(int x) {
		this.x = x;

	}

	demo8 show() {
		return this;
	}

	void show1() {
		System.out.println(x);
	}}

public class This_keyword2 {

	public static void main(String[] args) {

		demo8 obj = new demo8(10);
		obj.show();
		obj.show1();

	}

}
