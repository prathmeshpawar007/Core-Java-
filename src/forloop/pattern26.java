package forloop;

public class pattern26 {

	public static void main(String[] args) {
		int size = 9;
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= size; j++) {

				if (i == 1 || j == 1 || (i + j) == size + 1) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
