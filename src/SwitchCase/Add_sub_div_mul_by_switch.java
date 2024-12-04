package SwitchCase;

import java.util.*;

public class Add_sub_div_mul_by_switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		int b = sc.nextInt();

		System.out.println(" 1.add \n 2.sub\n 3.Div\n 4.mul");
		System.out.println("Enter the choice : ");
		int ch = sc.nextInt();
		//int c;

		switch (ch) {

		case 1:
			ch = a + b;
			System.out.println("Adition of a and b : " + ch);

			break;

		case 2:
			ch = a - b;
			System.out.println("Substraction of a and b : " + ch);
			break;

		case 3:
			ch = a / b;
			System.out.println("Division of a and b : " + ch);
			break;

		case 4:
			ch = a * b;
			System.out.println("Multiplication of a and b : " + ch);
			break;

		default:
			System.out.println("Invalid Choice");
		}

	}

}
