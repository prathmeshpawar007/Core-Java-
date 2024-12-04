package forloop;

public class pattern4 {

	public static void main(String[] args) {
		int num = 1;
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = i + 1; j <= size; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			
			System.out.println();

		}

	}

}
