package Array;

public class transpose_the_array {

	public static void main(String[] args) {

		int a[][] = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println("After Transpose");
		for (int i = 0; i < a.length; i++) { // 0<2 1<2
			for (int j = 0; j < a.length; j++) {// 0<2 1<2

				System.out.print(a[j][i] + " ");// a[0][0]=1 a[1][0]=3
												// a[0][1]=2 a[1][1]=4
			}
			System.out.println();
		}

	}

}
