package String;

import java.util.Iterator;

public class whole_String_in_ascending {

	public static void main(String[] args) {
		String s1 = "Hello";
		char ca[] = s1.toCharArray();

		char sa[] = { 'A', 'B' };
		String s2 = new String(sa);

		String s3 = "Hello and welcome";
		String ss[] = s3.split(" ");

		String sa1[] = { "Hello", "and", "welcome" };
		String s4 = "";
		for (int i = 0; i < sa1.length; i++) {

			s4 = s4 + sa1[i]+" ";
		

		}System.out.println(s4);	
		
		

	}

}
