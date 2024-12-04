package Array;

public class Pair_of_3 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 ,1};

		for (int i = 0; i < a.length; i++) {// 0<5

			for (int j = i + 1; j < a.length; j++) {

				for (int k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] < 9) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}

	}

}

