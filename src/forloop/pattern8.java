package forloop;

public class pattern8 {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {

			for (int j = i + 1; j <= 5; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

}








//i -> Rows        |  To remove 1 row (i + 1) 
//j-> Colomns      |  To remove 1 col (j + 1)
//Cube -> =1       |  j<=size
//increasing j=1   |  j<=i
//decreasing j=i   |  j<=size