package Array;

public class Mean_array {

	public static void main(String[] args) {
		int arr[] = { 78, 89, 67, 76 };

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}

		System.out.println(sum / arr.length);

	}

}
