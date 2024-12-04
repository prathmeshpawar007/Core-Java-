package If_Else;

public class if_else_food3 {

	public static void main(String[] args) {
		
		int amount=1010;
		if(amount>3000) {
			System.out.println("5 Star");
		}
		else {
			if(amount>1000) {
				System.out.println("KFC");
			}
			else {
				if(amount>500) {
					System.out.println("Mcd");
				}
				else {
					if(amount>200) {
						System.out.println("Thali");
					}
					else {
						System.out.println("Mess");
					}
				}
			}
		}
	}

}
