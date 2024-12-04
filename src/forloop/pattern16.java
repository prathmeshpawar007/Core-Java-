package forloop;

public class pattern16 {

	public static void main(String[] args) {
		int size = 9;
		for (int i = 1; i <= size; i++) {

			for (int j = 0; j <= 5; j++) {
				for (int k = 1; k <= 3; k++) {
					System.out.print(j + " ");
//				System.out.print(j+" ");
//				System.out.print(j+" ");
				}
			}
			System.out.println();
		}

	}

}
