package dailycode;

import java.util.*;

public class area_peimeter_rect {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();

		int area = l * b;
		System.out.println("Area of reactangle : " + area);
		int perimeter = 2 * (l + b);
		System.out.println("Perimeter of reactangle : " + perimeter);

	}

}
