package String;

public class String_to_ascending_by_length {

	public static void main(String[] args) {

		String s1 = "Hello and Welcome";

		String ch[] = s1.split(" ");

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i].length() > ch[j].length()) {
					String temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}

		for (String num : ch) {
			System.out.println(num);
		}
		System.out.println();
		String s3 = "";
		for (int i = 0; i < ch.length; i++) {
			s3 = s3 + ch[i] + " ";
		}
		System.out.println(s3);

	}

}
