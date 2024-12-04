package Exception_Handling;

class outofstock extends Exception {

	outofstock(String msg) {

		System.out.println(msg);
	}

}

public class Throw_Exception_Handling {

	public static void main(String[] args) {
		int order_NO = 51;
		int Total_QTY = 50;
		if (order_NO <= Total_QTY) {

			System.out.println("IN Stock");
		} else {

			try {

				throw new outofstock("Product is out of stock");
			} catch (Exception E) {

				System.out.println(E);
			}

		}

	}

}
