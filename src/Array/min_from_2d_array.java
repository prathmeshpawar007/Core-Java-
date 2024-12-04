package Array;

import java.util.Iterator;

public class min_from_2d_array {

	public static void main(String[] args) {

		int a[][] = { { 100, 200 }, { 1000, 2000 } };

		int min = Integer.MAX_VALUE;
		System.out.println(min);
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i][j] < min) {

					min = a[i][j];
				}
			}
		}

		System.out.println("Minimum number = " + min);
	}

}
