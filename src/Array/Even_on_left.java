package Array;

public class Even_on_left {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] % 2 == 1 && arr[j] % 2 == 0) {

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
