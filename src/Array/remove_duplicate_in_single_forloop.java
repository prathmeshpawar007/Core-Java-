package Array;

public class remove_duplicate_in_single_forloop {

	public static int duplicate(int[] a,int n) {

		int j = 0;
		for (int i = 0; i < n - 1; i++) {

			if (a[i] != a[i + 1]) {
				a[j] = a[i];

				j++;
			}

		}

		a[j] = a[n - 1];

		return j;
	}

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5,1,1,2,6,5,3};
		int n=a.length;
	int	k=remove_duplicate_in_single_forloop.duplicate(a,n);

		for (int j = 0; j<=k; j++) {
			System.out.println(a[j]);
			
		}

	}

}
