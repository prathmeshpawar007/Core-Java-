package NumberSeriesTypes;

public class palindrome_number {

	public static void main(String[] args) {

		int num = 1331;
		int rev = 0;
		int rem = 0;
		int temp = num;

		while (temp != 0) {

			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}

		if (rev == num) {
			System.out.println("Palindrom");
		} else
			System.out.println("Not Palindrom");

	}

}
