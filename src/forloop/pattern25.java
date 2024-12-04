package forloop;

public class pattern25 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= size; j++) {
				if (i == 3 || j == 3) {

					System.out.print("* ");
				} else
					System.out.print("O ");
			}
			System.out.println();
		}

	}

}
