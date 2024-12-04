package dailycode;

public class odd_even_factorial {

	public static void main(String[] args) {

		int n = 6;
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			if (i % 2 == n % 2) {
				fact = fact * i;

			}
		}
		System.out.println(fact);
	}

}
