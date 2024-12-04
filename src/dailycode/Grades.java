package dailycode;

import java.util.*;

public class Grades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 6 marks : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int m6 = sc.nextInt();

		double total = m1 + m2 + m3 + m4 + m5 + m6;
		double avg = total / 6;
		System.out.println("Total marks : " + total);
		System.out.println("Average marks : " + avg);

		if (avg >= 90 && avg <= 100) {
			System.out.println("A grade");
		} else if (avg >= 70 && avg < 90) {
			System.out.println("B grade");
		} else if (avg >= 40 && avg < 70) {
			System.out.println("C grade");
		} else
			System.out.println("Fail");
	}

}
