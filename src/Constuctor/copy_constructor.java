package Constuctor;

class demo2 {
	int id;
	String name;

	demo2(int a, String s) {

		System.out.println("In demo2 constructor");
		id = a;
		name = s;

	}

	demo2(demo2 dd) {

		System.out.println("In demo2 copy constoctor");
		id = dd.id;
		name = dd.name;

	}

	void display() {
		System.out.println("In display method");
		System.out.println(id);
		System.out.println(name);
	}

}

public class copy_constructor {

	public static void main(String[] args) {

		demo2 obj = new demo2(101, "PP");
		obj.display();
		demo2 obj1 = new demo2(obj);
		obj.display();
		

	}

}
