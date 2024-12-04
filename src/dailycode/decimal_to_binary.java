package dailycode;

public class decimal_to_binary {

	public static void main(String[] args) {

		int num = 10;
		String b = "";
		while (num != 0) {

			int rem = num % 2;
			b = rem + b;
			num = num / 2;
		}
		System.out.println(b);

	}

}
