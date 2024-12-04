package If_Else;

import java.util.*;

public class compare_input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();

		if (num == 10) {
			System.out.println("Number is equal to 10");
		} else if (num == 15) {
			System.out.println("Number is equal to 15");
		} else if (num == 20) {
			System.out.println("Number is equal to 20");
		} else
			System.out.println("Number is not equal to 10,15 & 20");
	}

}
