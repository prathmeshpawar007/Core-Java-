package Array;

public class Addition_of_two_array {

	public static void main(String[] args) {

		int arr1[] = { 10, 20, 30, 40, 50 };
		int arr2[] = { 12, 13, 14, 15, 16 };
		int arr3[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {

			arr3[i] = arr1[i] + arr2[i];

		}
		for (int num : arr3) {

			System.out.print(num + " ");
		}
		System.out.println();

	}

}
