package String;

public class Sting_all_methods {

	public static void main(String[] args) {

		String s1 = "hi";
		String s2 = new String("World");
		String s3 = "STUDENT";
		String s4 = "   hello";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.length());
		System.out.println(s3.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.isEmpty());
		System.out.println(s3.charAt(4));
		System.out.println(s3.indexOf('T'));
		System.out.println(s3.lastIndexOf("T"));
		System.out.println(s3.replace('D', 'F'));
		System.out.println(s4.trim());

	}

}
