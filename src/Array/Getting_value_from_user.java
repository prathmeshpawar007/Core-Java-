package Array;

import java.util.Scanner;

public class Getting_value_from_user {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the " + size + " Elements : ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}
		
		for (int num : arr) {
			System.out.println(num);
		}

	}

}
