package forloop;

public class find_nth_number_of_series {

	public static void main(String[] args) {

		int num = 1;
		int diff = 2;
		int nthterm = 4;
		for (int i = 0; i < nthterm; i++) {
			
			num = num + diff;
			diff++;

		}
		System.out.println(num);

	}

}
