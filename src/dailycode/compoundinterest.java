package dailycode;

public class compoundinterest {

	public static void main(String[] args) {
//		double p = 10000.0;
//		double r = 6;
//		int t = 2;
//		int n = 12;
//
//		double x = 1 + (r / (n * 100));
//		System.out.println(x);
//		int y = n * t;
//		System.out.println(y);
//
//		double z = Math.pow(x, y);
//		double ans = p * z;
//
//		System.out.println(ans);

		int p = 1000;
		double r = 0.05;
		int n = 12;
		int t = 5;
		double first = (1 + r / n);
		int sec = (n * t);
		double CI = p * Math.pow(first, sec);
		System.out.println("Compound interest : " + CI);

	}

}
