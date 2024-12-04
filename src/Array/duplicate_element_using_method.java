package Array;

public class duplicate_element_using_method {

	public static boolean duplicate(int[] b) {
		for (int i = 0; i < b.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j]) {
					count++;

				}

			}
			if (count == 0) {
				System.out.print(b[i] + " ");
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 1, 3, 6, 1 };

		duplicate_element_using_method.duplicate(a);
	}

}
