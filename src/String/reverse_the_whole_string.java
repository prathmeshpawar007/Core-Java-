package String;

public class reverse_the_whole_string {

	public static void main(String[] args) {

		String s1 = "Hello and Welcome";

		String sa[] = s1.split(" ");

		for (int i = 0; i < sa.length; i++) {

			String temp = sa[i];
			char ca[] = temp.toCharArray();

			int start = 0;
			int end = ca.length - 1;
			while (start < end) {

				char temp1 = ca[start];
				ca[start] = ca[end];
				ca[end] = temp1;
				start++;
				end--;

			}
			String s2 = new String(ca);
//			System.out.print(s2+" ");
			sa[i] = s2;

		}
		String s4 = "";
		for (int i = 0; i < sa.length; i++) {
			s4 = s4+sa[i]+" ";
		}
		System.out.println(s4+" ");

	}

}
