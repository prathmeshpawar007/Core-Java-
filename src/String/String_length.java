package String;

public class String_length {

	public static void main(String[] args) {

		String s1 = "Prathmesh";
		char ch[] = new char[s1.length()];
		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (s1.charAt(i) != 0) {
				count++;
			}

			ch[i] = s1.charAt(i);

		}
System.out.println(count);
	}

}
