package forloop;

public class sum_of_even_factors {

	public static void main(String[] args) {
	
		int num=30;
		int sum=0;
		for(int i=1;i<=30;i++) {
			
			if(num%i==0) {
				if(i%2==0) {
					sum=sum+i;
				}
			}
		}
		System.out.println(sum);

	}

}
