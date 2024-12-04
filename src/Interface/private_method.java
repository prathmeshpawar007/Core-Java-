package Interface;

interface PP {
	int a = 10;

	default void get(int n) {
		run();
		System.out.println("In default method get");
	}

	default int show() {
		return a;
	}

	public static void fun() {

		System.out.println("In static method fun");
		System.out.println(a);
	}

	private void run() {
		System.out.println("In private method run");

	}

}

public class private_method implements PP {

	public static void main(String[] args) {

		private_method obj = new private_method();
		obj.get(10);
		PP.fun();
		System.out.println(obj.show());
	}

}
