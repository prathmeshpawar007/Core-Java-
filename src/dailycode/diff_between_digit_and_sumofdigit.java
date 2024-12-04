package dailycode;

public class diff_between_digit_and_sumofdigit {

	public static void main(String[] args) {
		int s = 5;
		int count = 0;
		for (int i = 1; i <= 20; i++) {

			int sum = 0;
			int j = i;
			while (j != 0) {
				int rem = j % 10;
				sum = sum + rem;
				j = j / 10;
			}
			int diff = i - sum;
			if (diff > s) {

				count++;
			}

		}
		System.out.println(count);

	}

}
