package dailycode;

import java.util.*;

public class positive_negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Number is positive");
		} else
			System.out.println("Number is negative");
	}

}
