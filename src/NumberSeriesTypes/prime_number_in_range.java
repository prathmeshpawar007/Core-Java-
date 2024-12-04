package NumberSeriesTypes;

public class prime_number_in_range {

	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		
		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = start; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

				
			}
			if (count == 2) {
				System.out.println(i);
			}

		}
	}

}
