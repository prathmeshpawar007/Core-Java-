package If_Else;

import java.util.*;

public class Voting_eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("Enter users password");
		int userpass = sc.nextInt();
		
		int databasepass = 1331;

		if (age >= 18) {
			System.out.println("Eligible for voting");
		} else
			System.out.println("Not Eligible for voting");

		//System.out.println("if else statement executed");

		if (userpass == databasepass) {

			System.out.println("Password is correct");
		} else
			System.out.println("Password is not correct");

	}

}
