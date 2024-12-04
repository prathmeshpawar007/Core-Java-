package Array;

public class Remove_diff_element {

	public static void main(String[] args) {

		int a[] = { 2, 4, 6, 8, 10, 12 };
		int b[] = { 2, 4, 6, 8, 10 };

		int i = 0;
		for (; i < b.length; i++) {

			if (a[i] != b[i]) {
				System.out.println("Element : " + "" + a[i]);
				System.out.println("Index : " + i);
				break;
			}

		}
		if (i == b.length) {

			

			System.out.println("Element : " + a[i]);
			System.out.println("Index : " + i);

		}

	}

}
