package Recursion;

public class Simple_Recursion3 {

	static int sum(int num) {//10

		if (num > 0) {//10>0

			return num + sum(num - 1);//10+sum(9)//10+45=55000000000000
		} else {

			return 0;
		}

	}
	
//	static int sum(int num) {//9
//
//		if (num > 0) {//9>0
//
//			return num + sum(num - 1);//9+sum(8)//9+36=45
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//8
//
//		if (num > 0) {//8>0
//
//			return num + sum(num - 1);//8+sum(7)//8+28=36
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//7
//
//		if (num > 0) {//7>0
//
//			return num + sum(num - 1);//7+sum(6)//7+21=28
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//6
//
//		if (num > 0) {//6>0
//
//			return num + sum(num - 1);//6+sum(5)//6+15=21
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//5
//
//		if (num > 0) {//5>0
//
//			return num + sum(num - 1);//5+sum(4)//5+10=15
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//4
//
//		if (num > 0) {//4>0
//
//			return num + sum(num - 1);//4+sum(3)//4+6=10
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//3
//
//		if (num > 0) {//3>0
//
//			return num + sum(num - 1);//3+sum(2)//3+3=6
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//2
//
//		if (num > 0) {//2>0
//
//			return num + sum(num - 1);//2+sum(1)//2+1=3
//		} else {
//
//			return 0;
//		}
//
//	}
	
//	static int sum(int num) {//1
//
//		if (num > 0) {//1>0
//
//			return num + sum(num - 1);//1sum(0)//
//		} else {
//
//			return 0;
//		}
//
//	}
	
	
//	static int sum(int num) {//0
//
//		if (num > 0) {//0>0
//
//			return num + sum(num - 1);
//		} else {
//
//			return 0;
//		}
//
//	}

	public static void main(String[] args) {

		int num = 10;
		int sum1 = sum(num);
		System.out.println(sum1);

	}

}
