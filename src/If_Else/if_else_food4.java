package If_Else;
public class if_else_food4 {

	public static void main(String[] args) {
		int amount = 210;
		if (amount < 200) {
			System.out.println("Mess");
		} else {
			if (amount < 500) {
				System.out.println("Thali");
			} else {
				if (amount < 1000) {
					System.out.println("McD");
				} else {
					if (amount < 3000) {
						System.out.println("KFC");
					} else
						System.out.println("5 Star");
				}
			}
		}

	}

}
