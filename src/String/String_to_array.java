package String;

public class String_to_array {

	public static void main(String[] args) {

		String s1 = new String("Hello");
		char CA[] = new char[5];

		for (int i = 0; i < CA.length; i++) {

			CA[i] = s1.charAt(i);

		}
		for (char ch : CA) {
			System.out.println(ch);

		}
		System.out.println();

		for (int i = CA.length - 1; i >= 0; i--) {
			System.out.println(CA[i]);
		}

	}

}
