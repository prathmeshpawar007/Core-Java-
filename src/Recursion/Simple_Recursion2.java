package Recursion;

public class Simple_Recursion2 {

	static void print(int num) {

		if (num == 33) {

			return;

		}

		System.out.println(num);
		print(num + 3);
	}

	public static void main(String[] args) {

		print(3);

	}

}
