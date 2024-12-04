package forloop;

public class pattern7 {

	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=5;i++) {
			
			for(int j=i;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
		for(int i=2;i<=5;i++) {
			
			for(int j=1
					;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
