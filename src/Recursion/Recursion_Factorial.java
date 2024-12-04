package Recursion;

public class Recursion_Factorial {

	static int fact(int num) {

		if (num >= 1) {

			return num * fact(num - 1);
		} else {
			

			return 1;
		}

	}

	public static void main(String[] args) {

		int num = 5;
		int fact = fact(5);
		System.out.println(fact);

	}

}
