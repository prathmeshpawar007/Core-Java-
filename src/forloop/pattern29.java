package forloop;

public class pattern29 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if ((i+j)%2 == 0
						) {
					System.out.print("1 ");

				} else 
					System.out.print("0 ");
			}
			System.out.println();

		}

	}

}
