package Aggregation;

class one {

	void display() {
		System.out.println("In First");

	}

}

class two {

	one o1 = new one(); //reference of another class represents HAS-A relationship

	void display() {
		System.out.println("In second");
	}

}

public class Concep_of_aggregation {

	public static void main(String[] args) {

		two t2 = new two();

		t2.display();
		t2.o1.display();

	}

}
