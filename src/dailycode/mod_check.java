package dailycode;

public class mod_check {

	public static void main(String[] args) {

		int a = 21;
		int b = 5;
		int count = 0;

		for (int i = 1; i <= a; i++) {

			if (a % i == b) {

				count++;

			}
		}

		System.out.println(count);

	}

}
