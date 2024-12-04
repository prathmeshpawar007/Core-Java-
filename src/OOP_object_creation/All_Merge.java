package OOP_object_creation;

class demo2 {
	int num;
	int count = 0;
	int count1=0;

	void sumofdigit() {
		int rem = 0;
		int a = num;
		int sum = 0;
		while (a != 0) {
			rem = a % 10;
			sum = sum + rem;
			a = a / 10;

		}
		System.out.println("Sum of digit : " + sum);
	}

	void cnt() {
		
		int a=num;
		while(a!=0) {
			a=a/10;
			count++;
			
		}
		System.out.println("Count of digit : " + count);
	}

	void palindrome() {
		int a = num;
		int rev = 0;
		int rem;
		while (a != 0) {

			rem = a % 10;
			rev = rev * 10 + rem;
			a = a / 10;
		}
		if (rev == num) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");

	}

	void prime() {
		int a = num;

		for (int i = 1; i <= a; i++) {

			if (a % i == 0) {
				count1++;
			}

		}
		if (count1 == 2) {
			System.out.println("Prime");
		} else
			System.out.println("Not prime");

	}

}

public class All_Merge {

	public static void main(String[] args) {

		demo2 obj = new demo2();
		obj.num = 151;
		obj.sumofdigit();
		obj.cnt();
		obj.palindrome();
		obj.prime();

	}

}
