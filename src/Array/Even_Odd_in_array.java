package Array;

public class Even_Odd_in_array {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int evencount = 0;
		int oddcount = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}

		}
		int even[] = new int[evencount];
		int odd[] = new int[oddcount];
		int indexodd = 0;
		int indexeven = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				even[indexeven] = arr[i];
				indexeven++;

			} else {
				odd[indexodd] = arr[i];
				indexodd++;
			}
		}
		System.out.println("Even");
		for (int num : even) {

			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Odd");
		for (int num : odd) {

			System.out.print(num + " ");
		}

	}

}
