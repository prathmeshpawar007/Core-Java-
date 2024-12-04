package classes_and_object;

class demo1 {

	void get1() {
		System.out.println("In get1");

	}

	void get2(int n) {
		System.out.println("In get2");
		System.out.println(n);
	}

	void get3(String name, int id) {

		System.out.println(name + "\n" + id);
	}

}

public class calling_methods {

	public static void main(String[] args) {

		demo1 obj = new demo1
				();
		obj.get1();
		obj.get2(10);
		obj.get3("PP", 1331);

	}

}
