package Array;

import java.util.Iterator;

public class Even_at_left {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12 };

		int b[] = new int[a.length];

		int index = 0; // 1 2 3 4 5 6 7 8 9 10
		for (int i = 0; i < a.length; i++) {// 0<11 1<11 2<11 3<11 4<11 5<11

			if (a[i] % 2 == 0) {// 1%2==0 2%2==0 3%2==0 4%2==0 5%2==0 6%2==0

				b[index] = a[i];// b[0]=2 b[1]=4 b[2]=6

				index++;
			}

		}
		for (int j = 0; j < a.length; j++) {// 0<11 1<11 2<11 3<11 4<11 5<11

			if (a[j] % 2 == 1) {// 1%2!=0 2%2!=0 3%2!=0 4%2!=0 5%2!=0 6%2!=0
				b[index] = a[j];// b[6]=1 b[7]=3 b[8]=5
				index++;

			}

		}
		for (int num : b) {

			System.out.print(num + " ");
		}
		

	}

}
