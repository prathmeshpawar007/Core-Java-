package Static;

class demo {

	static void get() {
		System.out.println("In get");

	}

}

public class Static_method {

	public static void main(String[] args) {
		demo.get();

	}

}


//we can call static method without creating the object
//we can call static method by class name