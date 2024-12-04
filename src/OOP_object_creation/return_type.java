package OOP_object_creation;

public class return_type {

	int a = 10;

	void show() {
		int b = 20;
		System.out.println("Class Method" + b);
	}

	void show(int a) {
		System.out.println(a * a);
	}

	int show(int x, int y) {

		return x + y;
	}

	int show1() {

		return 2 * 2 * 2;
	}

	public static void main(String[] args) {

//		return_type obj;
//		obj = new return_type();
//		obj.show();

		return_type obj = new return_type();
		obj.show();
		System.out.println(obj.a);

		obj.show();
		obj.show(10);
		int r = obj.show(10, 20);
		System.out.println(r);
		System.out.println(obj.show1());
	}

}
