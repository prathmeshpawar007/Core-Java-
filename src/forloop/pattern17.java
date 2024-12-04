package forloop;

public class pattern17 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1, k = 1; i <= size; i++, k++) {

			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			int num = k;
			for (int j = i; j <= size; j++) {
				System.out.print(num + " ");
				num++;

			}
			System.out.println();
		}
		for (int i = 1, k = 5; i <= size; i++, k--) {

			for (int j = i + 1; j <= size; j++) {
				System.out.print(" ");
			}
			int num1 = k;
			for (int j = 1; j <= i; j++) {
				System.out.print(num1 + " ");
				num1++;

			}
			System.out.println();
		}

	}

}
