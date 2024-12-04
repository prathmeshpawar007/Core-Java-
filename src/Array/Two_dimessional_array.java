package Array;

public class Two_dimessional_array {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5, 6, 7 }, { 3, 4, 5, 6, 7, 8, 9 }, { 5, 6, 7, 8, 9, 10, 11 },
				{ 6, 7, 8, 9, 10, 11, 12 } };

		for (int i = 0; i < arr.length; i++) {
			System.out.print("{");
			for (int j = 0; j < 7; j++) {

				System.out.print(" " + arr[i][j] + " ");

			}
			System.out.print("}");
			System.out.println();
		}

	}

}
