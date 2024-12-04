package Array;

import java.util.Scanner;

public class Average_of_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the " + size + " Elements : ");

		for (int i = 0; i < arr.length; i++) {

			arr[i] = sc.nextInt();

		}
		int sum = 0;
		for (int num : arr) {

			sum = sum + num;

		}
		System.out.println("Average of array : " + (sum / arr.length));

	}

}