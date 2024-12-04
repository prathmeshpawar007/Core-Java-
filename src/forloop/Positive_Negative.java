package forloop;

public class Positive_Negative {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i > 0) {
				System.out.println("Positive : " + i);
			} else
				System.out.println("Negative : " + i);
		}
	}

}
