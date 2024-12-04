package forloop;

public class Even_Odd {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print("Even number"
						+ " : " + i);
				System.out.println();
			} else
				System.out.print("Odd Number : " + i+"  ");
		}

	}

}
