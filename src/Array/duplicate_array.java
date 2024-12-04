package Array;

public class duplicate_array {

	public static void main(String[] args) {

		int arr[] = { 1,2,3,2,1};

		for (int i = 0; i < arr.length; i++) {//0<5 //1<5 //2<5 //3<5 //4<5 // 5<5
			int count=0;
			for (int j = 0; j < i; j++) {//0<0 //0<1 1<1 //0<2 1<2 2<2 //0<3 1<3 2<3 3<3 // 0<4 1<4 2<4 3<4 4<4
				
				if(arr[i]==arr[j]) {//1==1 //2==1 //3==1 3==2 //2==1 2==2 2==3 2==1 // 1==1 1==2 1==3 1==2
					
					count++;//0 //0 //0 //1 //1
				}
				
			}
			if(count == 0) {//0 //0 // 0 //1 //1
				
				System.out.print(arr[i]+" ");//1 //2 //3 //_ //_
			}
		}

	}

}
