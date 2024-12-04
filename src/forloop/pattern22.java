package forloop;

public class pattern22 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= size; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
