package Array;

import java.util.*;

public class Array_3D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int arr[][][] = new int[a][b][c];
		System.out.println("Enter array elements");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				for (int k = 0; k < arr.length; k++) {

					arr[i][j][k] = sc.nextInt();

				}

			}

		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				for (int k = 0; k < arr.length; k++) {

					System.out.print(arr[i][j][k] + " ");

				}
				System.out.println();

			}
			System.out.println();

		}

	}

}
