package Array;

public class car_travel {

	public static void main(String[] args) {

		int a[] = { 1, 6, 3, 5, 2 };
		int km = 4;
		int fulereq = -1;
		for (int i = 0; i < a.length; i++) {

			int newkm = a[i] - km; // 1-4=-3 6-4=2

			if (newkm > fulereq) {// -3>-1=false 2>-1=true

				fulereq = newkm; // fulereq=2
			}

		}
		System.out.println(fulereq);

//		int max = Integer.MIN_VALUE;
//		for (int j = 0; j < a.length; j++) {
//
//			
//			if (a[j] > max) {
//
//				max = a[j];
//			}
//		}
//		
//		
//		System.out.println(max-km);

	}

}
