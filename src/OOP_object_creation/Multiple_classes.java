package OOP_object_creation;

class one {
	void get() {
		System.out.println("In class one get");
	}
}

class two {

	void get() {
		System.out.println("In class two get");
	}

}

public class Multiple_classes {

	public static void main(String[] args) {

		one obj = new one();
		two obj1 = new two();

		obj.get();
		obj1.get();

	}

}
