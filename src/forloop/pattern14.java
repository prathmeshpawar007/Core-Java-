package forloop;

public class pattern14 {

	public static void main(String[] args) {

		int size = 5;
		int num = 1;

		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}

	}

}
