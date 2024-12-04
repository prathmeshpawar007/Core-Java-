package dailycode;

public class nCr_sum {

	public static void main(String[] args) {

		int n = 4;
		int sum = 0;
		for (int r = 0; r <= n; r++) {
			int ans = fact(n) / (fact(r) * fact(n - r))
					;
			sum = sum + ans;

		}
		System.out.println(sum);
	}
	

	public static int fact(int n) {

		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;

		}
		return fact;

	}
}