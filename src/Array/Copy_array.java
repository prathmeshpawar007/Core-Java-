package Array;

public class Copy_array {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int arr1[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			arr1[i] = arr[i];

		}
		for (int num : arr) {
			System.out.print(num + " ");

		}
		System.out.println();
		for (int num : arr1) {
			System.out.print(num + " ");
		}

	}

}
