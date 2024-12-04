package forloop;

public class seperate_number {

	public static void main(String[] args) {
		int ele = 7;
		int start = 100;
		int end = 200;
		int count = 0;

		for (int i = start; i <= end; i++) {

			if (i % 10 == ele) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count : " + count);

	}

}
