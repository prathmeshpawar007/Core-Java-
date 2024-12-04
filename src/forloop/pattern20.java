package forloop;

public class pattern20 {

	public static void main(String[] args) {
		for (int i = 1, k = 'F'; i <= 6; i++, k--) {
			for (int j = i, p = k; j <= 6; j++, p--) {
				System.out.print((char) p + " ");

			}
			System.out.println();
		}
		for (int i = 2, k = 'B'; i <= 6; i++, k++) {
			for (int j = 1, p = k; j <= i; j++, p--) {
				System.out.print((char) p + " ");

			}
			System.out.println();
		}
	}

}
