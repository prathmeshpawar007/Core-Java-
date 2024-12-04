package dailycode;

public class GCD_of_factorial {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;

		int fact1 = 1;
		int fact2 = 1;

		for (int i = 1; i <= num1; i++) {

			fact1 = fact1 * i;
			

		}
		System.out.println(fact1);

		for (int i = 1; i <= num2; i++) {
			fact2 = fact2 * i;
			
		}
		System.out.println(fact2);

		int min = fact1;
		if (min > fact2)
			min = fact2;
		System.out.println(min);

		for (int i = min; i >= 1; i--) {

			if (fact1 % i == 0 && fact2 % i == 0) {

				System.out.println("GCD of factorial : " + i);

				break;

			}

		}

	}

}
