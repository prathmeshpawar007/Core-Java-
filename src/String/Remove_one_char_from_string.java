package String;

public class Remove_one_char_from_string {

	public static void main(String[] args) {
		String s1 = "Hello";
		char ch = 'p';
		int count = 0;
		count = 0;
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) == ch) {
				count++;

			} else {

				s2 = s2 + s1.charAt(i);

			}

		}
		System.out.println(s2);
		System.out.println();
		if (count == 0) {
			System.out.println("Element not found");
		}

	}

}
