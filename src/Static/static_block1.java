package Static;

class first {

	static {
		System.out.println("In static block of first");

	}

	static void show1() {
		System.out.println("In Static method of first");

	}

}

public class static_block1 {

	static void show2() {

		System.out.println("In Static method of static_block1");
	}

	static {
		System.out.println("In Static block of static_block1");
	}

	public static void main(String[] args) {
		first.show1();
		show2();

	}

}
