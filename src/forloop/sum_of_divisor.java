package forloop;

public class sum_of_divisor {

	public static void main(String[] args) {
		int num=18;
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
