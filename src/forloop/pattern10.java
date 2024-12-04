package forloop;

public class pattern10 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1 + 1; j <= i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= size; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 2; i <= 5; i++) {

			for (int j = i + 1; j <= size; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= 5; j++) {

				System.out.print("* ");
			}
			System.out.println();
		

		}
	}

}
