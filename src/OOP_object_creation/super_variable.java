package OOP_object_creation;

class one1 {

	int a = 10;

	void get() {
		System.out.println("in parents get");

	}

	
}

class two2 extends one1 {
	int a = 20;

	void get() {
		super.get();
		System.out.println("In childs get");
		System.out.println(a + " " + super.a);
	}

}

public class super_variable {

	public static void main(String[] args) {

		two2 obj = new two2();
		obj.get();
		

	}

}
