package Array;

import java.util.*;

public class Addition_of_2d_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = 2;
		int arr[][] = new int[size][size];
		int arr1[][] = new int[size][size];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = sc.nextInt();
				arr1[i][j] = sc.nextInt();

			}
		}

		int arr2[][] = new int[size][size];
		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				arr2[i][j] = arr[i][j] + arr1[i][j];

			}
		}

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");

			}
			System.out.println();

		}

	}
}
