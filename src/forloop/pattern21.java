package forloop;

public class pattern21 {

	public static void main(String[] args) {

		int size = 6;

		for (int i = 1, ch = 'A'; i <= size; i++, ch++) {
			System.out.print((char) ch + " ");
			

			for (int j = 2, p = ch, num = 5; j <= i; j++) {
				p = p + num;
				System.out.print((char) p + " ");

			}
			System.out.println();
		}

	}

}
