package Array;

public class left_shift_array {

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55 };
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];

		}
		arr[arr.length - 1] = temp;
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//
//		}
		System.out.println();
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}

//public class left_shift_array {
//
//	public static void main(String[] args) {
//
//		int arr[] = { 11, 22, 33, 44, 55 };
//		int temp = arr[0];
//		for (int i = 0; i < arr.length - 1; i++) {
//
//			arr[i] = arr[i + 1];
//			System.out.println(arr[i]);
//		}
//		System.out.println(temp);
//
//	}
//
//}
