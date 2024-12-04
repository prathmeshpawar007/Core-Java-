package Array;

public class transition {

	public static void main(String[] args) {
		int a[] = { 3, 7, 90, 20, 5, 50, 40 };
		int k = 3;
		int min = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < a.length - (k-1); i++) {//0<5 1<5 2<5 3<5 4<5 
			int sum = 0;
			for (int j = i; j < i + k; j++) {//0<3 1<3 2<3 1<4 2<4 3<4 
											 //2<5 3<5 4<5 3<6 4<6 5<6
											 //4<7 5<7 6<7
				
				System.out.print(a[j] + " ");
				sum = sum + a[j];//0+3=3 3+7=10 10+90=100
								 //0+7=7 7+70=97 97+20=117	
								 //0+90=90 90+20=110 110+5=115
								 //0+20=20 20+5=25 25+50=75
								 //0+5=5 5+50=55 55+40=95
			}

			System.out.println(" = " + sum);
			if (sum < min) { 
				min = sum;
				index = i;
			}
		}
		System.out.println();
		System.out.println("min = " + min);//min = 75 
		System.out.println("Avg = " + min / k + " " + index);//Avg = 25 3

	}

}
