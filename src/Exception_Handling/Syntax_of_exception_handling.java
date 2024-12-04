package Exception_Handling;

public class Syntax_of_exception_handling {

	public static void main(String[] args) {

		System.out.println("LOG-IN");
		System.out.println("Search a product");
		System.out.println("Add To Cart");

		try {
			System.out.println("Payment" + 10 / 0);
		} catch (Exception a) {

			System.out.println("Try again letter");
		}
	}

}
