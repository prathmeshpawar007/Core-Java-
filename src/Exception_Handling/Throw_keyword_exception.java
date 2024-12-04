package Exception_Handling;

class OutofStock extends Exception {

	OutofStock(String msg) {

		System.out.println(msg);
	}

}

public class Throw_keyword_exception {

	public static void main(String[] args) {
		// throw(USER DEFINE / DEVELOPER DEFINE
		try {

			throw new OutofStock("Product is out of stock");
		} catch (Exception E) {

			System.out.println(E);

		}

		// throw(PRE DEFINE)
		try {

			throw new ArithmeticException();
		} catch (Exception E) {
			System.out.println(E);
		}

	}

}
