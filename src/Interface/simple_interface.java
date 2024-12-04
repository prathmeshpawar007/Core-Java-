package Interface;

interface demo {

	void get();

}

class demo1 implements demo {

	public void get() {
		System.out.println("In demo");
	}
}

public class simple_interface {

	public static void main(String[] args) {
		demo1 obj = new demo1();
		obj.get();

	}

}
