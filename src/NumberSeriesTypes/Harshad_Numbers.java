package NumberSeriesTypes;

public class Harshad_Numbers {

	public static void main(String[] args) {

		int num = 120;
		int sum = 0;
		int temp=num;
		while (num != 0) {

			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;

		}

		if (temp % sum == 0) {
			System.out.println("Harshad Number");
		} else
			System.out.println("Not harshad number");

	}

}
