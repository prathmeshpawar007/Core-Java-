package SwitchCase;

import java.util.*;

public class all_mixed {

	public static void main(String[] args) {

		System.out.println(
				"case 1 : Sum of digit \n case 2 : Count of digit \n case 3 : Factorial \n "
				+ "case 4 : Even or odd \n case 5 : Palindrome \n case 6 : prime Number");

		System.out.println("Enter the choice : ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			int num = 123;
			int rem = 0;
			int sum = 0;
			while (num != 0) {
				rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
			System.out.println(sum);
			break;
		case 2:
			int num1 = 123;
			int rem2 = 0;
			int count = 0;
			while (num1 != 0) {
				rem2 = num1 % 10;
				count++;
				num1 = num1 / 10;
			}
			System.out.println(count);
			break;
		case 3:
			int num3 = 5;
			int fact = 1;
			for (int i = 1; i <= 5; i++) {

				fact = fact * i;
			}
			System.out.println(fact);
			break;

		case 4:
			int num4 = 14;

			if (num4 % 2 == 0) {
				System.out.println("Even number");
			} else
				System.out.println("odd number");

			break;

		case 5:
			int num5 = 1331;
			int rem5 = 0;
			int rev = 0;
			int temp = num5;

			while (num5 != 0) {
				rem5 = num5 % 10;
				rev = rev * 10 + rem5;
				num5 = num5 / 10;
			}
			if (rev == temp) {
				System.out.println("palindrome");
			} else
				System.out.println("not palindrome");
			break;

		case 6:
			int num6 = 23;
			int count1 = 0;
			for (int i = 1; i <= num6; i++) {

				if (num6 % i == 0) {
					count1++;

				}

			}
			if (count1 == 2) {
				System.out.println("Prime");
			} else
				System.out.println("Not prime");

			break;

		}
	}

}
