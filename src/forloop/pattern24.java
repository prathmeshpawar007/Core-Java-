package forloop;

public class pattern24 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= size; j++) {
				if (i == j || i + j == size + 1) {

					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
