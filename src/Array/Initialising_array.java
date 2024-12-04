package Array;

public class Initialising_array {

	public static void main(String[] args) {

		int sub1 = 78;
		int sub2 = 69;
		int sub3 = 89;
		int sub4 = 91;

		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
		System.out.println(sub4);

		int subject[] = { 78, 69, 89, 91 };

		System.out.println("Print by forloop");

		System.out.println(subject);// prints the address of array from heap memory

		for (int i = 0; i < subject.length; i++) {

			System.out.println(subject[i]);

		}

	}

}
