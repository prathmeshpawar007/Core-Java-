package dailycode;

public class swapvariable {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

//		int temp = 0;  
//		temp = num1;
//		num1 = num2;
//		num2 = temp;
//
//		num1 = num1 + num2;     //10+20=30
//		num2 = num1 - num2;     //30-20=10
//		num1 = num1 - num2;     //30-10=20 

		num1 = num1 * num2;    // 10*20=200
		num2 = num1 / num2;    // 200/20=10
		num1 = num1 / num2;    // 200/10=20

		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

	}

}
