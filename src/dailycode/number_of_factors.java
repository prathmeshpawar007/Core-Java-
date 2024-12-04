package dailycode;

public class number_of_factors {

	public static void main(String[] args) {

		int num = 9;
		int count = 0;

		for (int i = 1; i <= num; i++) {

			if (num % i == 0)
				count++;
		}

		if (count == 3) {
			System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
