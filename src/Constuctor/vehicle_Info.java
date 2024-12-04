package Constuctor;

class vehicle {

	int wheelCount;
	String colour;
	int geersCount;

	vehicle() {

		colour = "Yellow";
		geersCount = 5;
	}

	vehicle(String c, int gc) {
		colour = c;
		geersCount = gc;

	}

	void display() {
		System.out.println(colour);
		System.out.println(geersCount);
	}
}

public class vehicle_Info {

	public static void main(String[] args) {
		vehicle obj1 = new vehicle();
		obj1.display();
		vehicle obj2 = new vehicle("Red", 5);
		obj2.display();

	}

}
