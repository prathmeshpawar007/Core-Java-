package Inheritance;

class one {

	void get() {

		System.out.println("In get");
	}
}

class two extends one {

	void show() {

		System.out.println("In show");
	}
}

class three extends two {

	void display() {
		System.out.println("In display");
	}
}

class multilevel_inheritance {

	public static void main(String[] args) {

		three obj = new three();
		obj.get();
		obj.show();
		obj.display();

	}
}
