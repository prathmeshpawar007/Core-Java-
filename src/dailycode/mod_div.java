package dailycode;

import java.util.*;

public class mod_div {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days : ");
		
		int totaldays = sc.nextInt();

		int years = totaldays / 365;
		int rem1 = totaldays % 365;

		int months = rem1 / 30;
		int rem2 = rem1 % 30;

		int weeks = rem2 / 7;

		int days =  rem2 % 7;

		System.out.println("In " + totaldays + " days \n" + years + " years, \n" + months + " months, \n" + weeks
				+ " weeks,\nand " + days + " days are there....");

	}

}
