package SwitchCase;

import java.util.*;

public class vowel_consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);//here if we increses the number number of character increases 

		switch (ch) {

		case 'A':

		case 'E':

		case 'I':

		case 'O':

		case 'U':

		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");

		}

	}

}
