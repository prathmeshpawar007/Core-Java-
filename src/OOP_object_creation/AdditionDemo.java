package OOP_object_creation;

class arithmetic {

	int num1;
	int num2;
	int result;

	void addition() {

		result = num1 + num2;
		System.out.println(result);

	}

	void subtraction() {

		result = num1 - num2;
		System.out.println(result);

	}

	void division() {

		result = num1 / num2;
		System.out.println(result);
	}

	void multiplication() {

		result = num1 * num2;
		System.out.println(result);
	}

}

public class AdditionDemo {

	public static void main(String[] args) {
		
		arithmetic demo=new arithmetic();
		demo.num1=10;
		demo.num2=5;
		demo.addition();
		demo.subtraction();
		demo.division();
		demo.multiplication();
		

	}

}
