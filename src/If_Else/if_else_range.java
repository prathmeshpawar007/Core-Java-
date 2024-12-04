package If_Else;

public class if_else_range {

	public static void main(String[] args) {
		char ch = '@';

		if (ch >= '0' && ch <= '9') {
			System.out.println("NUMBER");

		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'z')) {
			System.out.println("ALPHABATE");
		} else
			System.out.println("SPECIAL CHARACTER");

	}

}
