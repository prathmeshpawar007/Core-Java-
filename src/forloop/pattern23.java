package forloop;

public class pattern23 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				if ((i == 2 && j == 3) || (i == 2 && j == 4) || (i == 3 && j == 4) ) {
					System.out.print("  ");
				} else
					System.out.print("* ");
			}
			System.out.println();
		}

	}

}
