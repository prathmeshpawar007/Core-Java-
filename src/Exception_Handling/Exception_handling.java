package Exception_Handling;

public class Exception_handling {

	public static void main(String[] args) {

		String s1 = null;
		try {
			System.out.println(s1.toLowerCase());
		} catch (Exception e) {
			System.out.println(e);
		}

		int arr[] = { 1, 2, 3 };
		try {
			System.out.println(arr[3]);
		} catch (Exception a) {
			System.out.println(a);
		}

		try {
			System.out.println(10 / 0);
		} catch (Exception s) {
			System.out.println(s);
		}
	}

}

//try -> risky code
//catch -> handle	

