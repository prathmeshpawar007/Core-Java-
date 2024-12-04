package NumberSeriesTypes;

public class tetrahedral_Number {

	public static void main(String[] args) {

		int num = 1;
		int diff1 = 3;
		int diff2 = 3;

		for (int i = 1; i <= 10; i++) {

			System.out.print(num+" ");
			num = num + diff1;
			diff1 = diff1 + diff2;
			diff2++;
		}

	}

}
