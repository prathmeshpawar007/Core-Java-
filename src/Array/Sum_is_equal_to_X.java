package Array;

import java.util.Iterator;

public class Sum_is_equal_to_X {

	public static void main(String[] args) {

		int a[] = { 1, 4, 45, 6, 10, 8 };
		int x = 16;
		boolean res = ABC(a, x);
		if (res == true) {
			System.out.println("yes");
		} else
			System.out.println("No");

	}

	public static boolean ABC(int a[], int x) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == x) {
					return true;
				} 
			}
		}
		return false;

		// int a[] = { 1, 4, 45, 6, 10, 8 };
//		int x = 16;
//		int count = 0;
//		for (int i = 0; i < a.length; i++) {
//
//			for (int j = i + 1; j < a.length; j++) {
//
//				if (a[i] + a[j] == x) {
//
//					count++;
//					break;
//
//				}
//			}
//		}
//		if (count != 0) {
//
//			System.out.println("Yes");
//		} else
//			System.out.println("No");

	}

}
