package forloop;

public class pattern30 {

	public static void main(String[] args) {
		int col = 5;
		int row = 8;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= col; j++) {

				if ((j == 1 && i != 1) || (j == 5 && i != 1) || i == 4 || (i == 1 && j != 1 && j != 5)) {
					System.out.print("* ");
				} else
					System.out.print("  ");

			}
			System.out.println();

		}

	}

}
