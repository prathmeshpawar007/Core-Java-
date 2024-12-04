package Array;

public class duplicate_array_stored_in_another_array {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 4, 4, 5, 5, 6, 7, 6, 1, 3, 2 };
		int orignalcount = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					count++;

				}

			}
			if (count == 0) {
				orignalcount++;
			}

		}

		int b[] = new int[orignalcount];

		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			int count = 0;
			
			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {
					count++;

				}
				
			}

			if (count == 0) {
				b[index] = arr[i];
				index++;
			}

		}
		for (int num : b) {
			System.out.print(num+" ");
		}
	}

}
