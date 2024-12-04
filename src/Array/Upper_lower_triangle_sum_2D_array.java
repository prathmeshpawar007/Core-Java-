package Array;

public class Upper_lower_triangle_sum_2D_array {

	public static void main(String[] args) {

		int a[][] = { { 6, 5, 4 }, { 1, 2, 5 }, { 7, 9, 7 } };

		int uppersum = 0;
		int lowersum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (i == j || i < j) {

					uppersum = a[i][j] + uppersum;

				}
				if (i == j || i > j) {

					lowersum = a[i][j] + lowersum;
				}

			}
		}
		System.out.println(uppersum);
		System.out.println(lowersum);

	}

}
