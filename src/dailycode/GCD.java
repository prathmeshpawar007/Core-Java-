package dailycode;

public class GCD {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 9;

		int min = num1;
		if (min > num2)
			min = num2;

		for (int i = min; i >= 1; i--) {

			if (num1 % i == 0 && num2 % i == 0) {

				System.out.println(i);
				break;
			}
		}

	}

}
