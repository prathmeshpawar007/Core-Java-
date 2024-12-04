package forloop;

public class pattern12 {

	public static void main(String[] args) {

		int size = 5;
		for (int i = 1; i <= 5; i++) {
			int p = 5;
			for (int j = 1; j <= i; j++) {

				System.out.print(p+" ");
				p--;
//				System.out.print(size+1-j);
			}
			System.out.println();
		}

	}

}
