package Constuctor;

class demo4 {

	int id;
	String name;

	void get(int id, String name) {

		this.id = id;
		this.name = name;

	}

	void display() {

		System.out.println(id);
		System.out.println(name);
	}
}

public class this_keyword {

	public static void main(String[] args) {
		demo4 obj = new demo4();
		obj.get(5, "PP");
		obj.display();

	}

}
