package dailycode;

public class pythagores_templets {

	public static void main(String[] args) {
		
		int limit=20;
		int count=0;
		
		for(int a=1;a<=limit;a++) {
			
			for(int b=a+1;b<=limit;b++){
				
				for(int c=b+1;c<=limit;c++) {
						
					if((a*a)+(b*b)==(c*c)){
						
						count++;
					}
					
				}
				
			}
		}
			
		System.out.println(count);
	}

}
