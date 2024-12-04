package Array;

public class Right_shift_Array {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55 };
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {

			arr[i] = arr[i - 1];
		
		}
		arr[0] = temp;

		for (int num : arr) {
			System.out.print	(num+" ");

		}

	}

}
