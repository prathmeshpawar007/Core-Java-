package dailycode;

import java.util.*;

public class average {
	public static void main(String[] args) {

		int m1, m2, m3, m4, m5, m6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 6 marks : ");
		
		
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();
		m6 = sc.nextInt();
		
		int total = m1 + m2 + m3 + m4 + m5 + m6;
		System.out.println("Total = " + total);
		
		int avg = total / 6;
		System.out.println("Average = " + avg);

	}
}
