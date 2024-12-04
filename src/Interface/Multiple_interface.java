package Interface;

interface sample11 {
	void get();

}

interface sample12 extends sample11 {
	default void show() {
		System.out.println("In default get1");

	}// we can give body to a method by using methods access specifier is default or
		// static

	static void get1() {

		System.out.println("In static get1");
	}

}

public class Multiple_interface implements sample12 {

	public void get() {
		System.out.println("In get");
	}

	public static void main(String[] args) {

		Multiple_interface obj = new Multiple_interface();
		obj.get();
		obj.show();

	}

}
