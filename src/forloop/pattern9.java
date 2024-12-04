package forloop;

public class pattern9 {

	public static void main(String[] args) {
		int num = 1;
		int size = 5;

		for (int i = 1; i <= size; i++) {

			for (int j = i+1; j <= size; j++) {

				System.out.print("  ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			for(int j=1+1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
