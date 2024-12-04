package Array;

public class Selection_sort {

	public static void main(String[] args) {

		int a[] = { 3, 4, 2, 1 };

		for (int i = 0; i < a.length; i++) {//i loop for sorted array
			int min = i;//MIN=i
			for (int j = i + 1; j < a.length; j++) {//J loop for un-sorted array

				if (a[j] < a[min]) {
	//if j loop/unsorted 
					

					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int num : a) {

			System.out.print(num + " ");
		}

	}

}
