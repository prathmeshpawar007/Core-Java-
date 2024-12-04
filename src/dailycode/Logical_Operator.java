package dailycode;

public class Logical_Operator {

	public static void main(String[] args) {

		int a = 4, b = 2, c = 6;
		System.out.println(a >= 4 && b < c);
		System.out.println(a <= b && b == 2);
		System.out.println(a != 4 || b < c);
		System.out.println(a <= b || b == 2);
		System.out.println(!(a <= b || b == 2));

	}

}
