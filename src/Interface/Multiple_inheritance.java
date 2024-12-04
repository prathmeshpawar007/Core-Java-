package Interface;

interface one {

	void get();

	default void disp() {
		System.out.println("PP");
	}

}

interface two {

	void get1();

}

interface three {

	void get2();
}

class four implements one, two, three {

	public void get() {
		System.out.println("In get");
	}

	public void get1() {
		System.out.println("In get1");
	}

	public void get2() {
		System.out.println("In get2");
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {

		four obj = new four();
		obj.get();
		obj.disp();
		obj.get1();
		obj.get2();
	}

}
