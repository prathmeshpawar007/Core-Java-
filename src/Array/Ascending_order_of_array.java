package Array;

public class Ascending_order_of_array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 3, 6 };
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}

		for (int num : arr) {

			System.out.print(num + " ");
		}

	}
}