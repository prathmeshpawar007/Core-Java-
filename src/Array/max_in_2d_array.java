package Array;

public class max_in_2d_array {

	public static void main(String[] args) {

		int a[][] = { { 100, 200 }, { 1000, 2000 }

		};
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {
				if (a[i][j] > max) {

					max = a[i][j];
				}
			}
		}

		System.out.println("Maximum number = " + max);
	}

}
