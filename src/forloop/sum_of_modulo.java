package forloop;

public class sum_of_modulo {

	public static void main(String[] args) {
		int n = 10;
		int k = 2;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + (i % k);
		}
		System.out.println(sum);

	}
	

}
