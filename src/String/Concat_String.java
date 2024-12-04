package String;

public class Concat_String {

	public static void main(String[] args) {

		String s1 = "Good";
		String s2 = "Morning";
		String s3 = "Evening";
		String s4 = "A";
		String s5 = "CA";
		String str = "all the best";

		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(" " + s1));
		System.out.println(s1.concat(" " + s3));
		System.out.println(s1.concat(" " + s3.concat(" " + s2)));
		System.out.println(s1.equals(s3));
		System.out.println(s4.compareTo(s5));// Print diff of askey value
		System.out.println(s1.contentEquals(s2));
		System.out.println(str.startsWith("all"));

	}

}
