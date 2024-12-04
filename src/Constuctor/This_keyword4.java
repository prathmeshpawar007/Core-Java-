package Constuctor;

class demo10 {
	int x, y;

	demo10(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void show() {
		show1(this);
	}

	void show1(demo10 obj) {
		int a = x;
		int b = y;
		System.out.println(a + b);
	}
}

public class This_keyword4 {

	public static void main(String[] args) {

		demo10 obj1 = new demo10(10, 30);
		obj1.show();

	}

}
