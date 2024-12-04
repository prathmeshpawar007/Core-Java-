package Inheritance;

class Test1 {
	int num1;
	int num2;
}

class Test2 extends Test1 {
	int num3;

	void display() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
	}
}

public class Test2Demo {

	public static void main(String[] args) {

		Test2 obj = new Test2();
		obj.num1 = 10;
		obj.num2 = 20;
		obj.num3 = 30;

		obj.display();
	}

}
