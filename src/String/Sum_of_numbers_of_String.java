package String;

public class Sum_of_numbers_of_String {

	public static void main(String[] args) {

		String s1 = "98ji6owSD";
		int sum = 0;

		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {

				int num = s1.charAt(i) - 48;
				sum = sum + num;

			}

		}

		System.out.println(sum);
	}

}
