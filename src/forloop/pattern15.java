package forloop;

public class pattern15 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= size; i++) {
			System.out.print(i + " ");
			int p = i;
			int num = 4;
			for (int j = 1 + 1; j <= i; j++) {

				p = p + num;
				System.out.print(p + " ");
				num--;

			}

			System.out.println();
		}

	}

}
