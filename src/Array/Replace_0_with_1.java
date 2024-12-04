package Array;

public class Replace_0_with_1 {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 1, 0, 1 };
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {

				arr[i] = 1;
			}

		}
		for (int num : arr) {

			System.out.print(num + " ");
		}

	}

}
