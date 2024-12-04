package String;

public class sort_number_string {

	public static void main(String[] args) {

		String s1 = "1324";
		char ca[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {

				if (ca[i] > ca[j]) {
					char temp = ca[i];
					ca[i] = ca[j];
					ca[j] = temp;

				}
			}
		}
		for (char ch : ca) {

			System.out.println(ch);
		}
		System.out.println();
		String s2 = new String(ca);
		System.out.println(s2);

	}

}
