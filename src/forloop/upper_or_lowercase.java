package forloop;
import java.util.*;
public class upper_or_lowercase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the character : "); 
		
		char ch = sc.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else
			System.out.println("Uppercase");
	}

}
