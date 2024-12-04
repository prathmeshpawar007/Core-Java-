package Array;

public class Leader_element_from_array {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1 };

		for (int i = 0; i < a.length; i++) {// 0<6 1<6
			int count = 0;// 4 //3
			for (int j = i + 1; j < a.length; j++) {// 1<6 // 2<6
				if (a[i] < a[j]) {// 1<2 1<3 1<4 1<5 1<1 // 2<3 2<4 2<5 2<1

					count++;// 4 //3
				}

			}
			if (count == 0) {// 4==0 3==0

				System.out.println("Leader Elements : " + a[i]);

			}

		}

	}

}
