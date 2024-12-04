package String;

public class Remove_char_index_wise {

	public static void main(String[] args) {
		int ch = 2
				;
		String s1 = "Hello";
		int count = 0;
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (i == ch) {
				count++;

			} else {

				s2 = s2 + s1.charAt(i);
			}

		}
		System.out.println(s2);
		if (count == 0) {
			System.out.println("Element not found");
		}

	}

}
