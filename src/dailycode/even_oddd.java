package dailycode;

import java.util.*;

public class even_oddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else
			System.out.println("Number is odd");

	}

}
