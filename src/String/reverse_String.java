package String;

public class reverse_String {

	public static void main(String[] args) {

		String s1 = "Hello";

		char CA[] = s1.toCharArray();
		int start = 0;
		int end = CA.length - 1;
		while (start < end) {
			char temp = CA[start];
			CA[start] = CA[end];
			CA[end] = temp;
			start++;
			end--;

			
		}

		for (char ch : CA) {
			System.out.println(ch);
		}
		System.out.println();
		String s2=new String(CA);
		System.out.println(s2);

	}

}
