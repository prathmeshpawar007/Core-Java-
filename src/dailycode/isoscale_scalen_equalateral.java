package dailycode;

import java.util.*;

public class isoscale_scalen_equalateral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three sides");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();

		if (side1 == side2 && side2 == side3) {

			System.out.println("Equilateral Triangle ");
		} else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("Isoscalas Triangle");

		} else {
			System.out.println("Scalen Triangle");
		}

	}

}
