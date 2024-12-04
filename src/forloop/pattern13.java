package forloop;

public class pattern13 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1, k = 0; i <= size; i++, k++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			for (int j = 1 + 1, p = k; j <= i; j++, p--) {
				System.out.print(p+ " ");

			}

			System.out.println();
		}

	}

}
