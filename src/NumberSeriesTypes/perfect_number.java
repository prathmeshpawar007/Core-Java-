package NumberSeriesTypes;

public class perfect_number {

	public static void main(String[] args) {
		
		int num=15;
		int sum = 0;
		for (int i=1;i<num;i++) {
			
			if(num%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==num) {
			System.out.println("Perfect number");
		}else
			System.out.println("Not Perfect number");

	}

}
