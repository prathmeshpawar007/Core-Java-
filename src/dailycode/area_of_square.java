package dailycode;

import java.util.*;

public class area_of_square {

	public static void main(String[] args) {
		System.out.println("Enter the side of Square : ");
		Scanner sc = new Scanner(System.in);
		double side = sc.nextDouble();
		double area = side * side;
		System.out.println("Area of square : " + area);

	}

}
