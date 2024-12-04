package Array;

public class Maximum_difference {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 2, 2, 1 };
		int max = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
				int diff = 0;

				if (a[i] == a[j]) {

					diff = j - i;

				}
				if (diff > max) {
					max = diff;

				}
			}
		}

		System.out.println(max);
	}

}
