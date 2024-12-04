package Array;

import java.util.Iterator;

public class Array_sort_basic {

	static void sort(int a[],int index,int count1) {
	
	for (int i = 0; i < a.length; i++) {

		int count = 0;
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] == a[j]) {

				count++;
			}
		}
		if (count == 0) {
			count1++;
		}

	}
	int a1[] = new int[count1];

	for (int i = 0; i < a.length; i++) {

		int count = 0;
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] == a[j]) {

				count++;
			}
		}
		if (count == 0) {
			a1[index] = a[i];
			index++;
		}

	}
	for (int i = 0; i < a1.length; i++) {

		for (int j = i + 1; j < a1.length; j++) {
			if (a1[i] > a1[j]) {
				int temp = a1[i];
				a1[i] = a1[j];
				a1[j] = temp;
			}
		}
	}
	for (int num : a1) {
		System.out.print(num + " ");
	}

	
	}
	
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 2, 4, 6 };
		int index = 0;
		int count1 = 0;
		Array_sort_basic.sort(a,count1,index);

		
	}

}
