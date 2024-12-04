package Recursion;

public class Simple_Recursion {

	static void print(int num) {// 10

		if (num == 0) {// 10==0
			return;
		}

		System.out.println(num);// 10
		print(num - 1);// 9

	}

//	static void print(int num) {//9
//
//		if (num == 0) {//9==0
//			return;
//		}
//
//		System.out.println(num);//9
//		print(num - 1);//8
//
//	}

//	static void print(int num) {//8
//
//		if (num == 0) {//8==0
//			return;
//		}
//
//		System.out.println(num);//8
//		print(num - 1);//7
//
//	}

//   static void print(int num) {//7
//
//		if (num == 0) {//7==0
//			return;
//		}
//
//		System.out.println(num);//7
//		print(num - 1);//6
//
//	}

//	static void print(int num) {//6
//
//		if (num == 0) {//6==0
//			return;
//		}
//
//		System.out.println(num);//6
//		print(num - 1);//5
//
//	}

//	static void print(int num) {//5
//
//		if (num == 0) {//5==0
//			return;
//		}
//
//		System.out.println(num);//5
//		print(num - 1);//4
//
//	}

//	static void print(int num) {//4
//
//		if (num == 0) {//4==0
//			return;
//		}
//
//		System.out.println(num);//4
//		print(num - 1);//3
//
//	}

//	static void print(int num) {//3
//
//		if (num == 0) {//3==0
//			return;
//		}
//
//		System.out.println(num);//3
//		print(num - 1);//2
//
//	}

//	static void print(int num) {//2
//
//		if (num == 0) {//2==0
//			return;
//		}
//
//		System.out.println(num);//2
//		print(num - 1);//1
//
//	}

//	static void print(int num) {//1
//
//		if (num == 0) {//1==0
//			return;
//		}
//
//		System.out.println(num);//1
//		print(num - 1);//0
//
//	}

//	static void print(int num) {//0
//
//		if (num == 0) {//0==0
//			return;
//		}
//
//		System.out.println(num);
//		print(num - 1);
//
//	}

	public static void main(String[] args) {

		print(10);

	}

}
