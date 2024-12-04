package Exception_Handling;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			
			System.out.println(10/0);
			int arr[]= {10,20};
			System.out.println(arr[10]);
			
			String s1="";
			s1.toLowerCase();
			
		}catch(Exception E) {
			
			System.out.println(E);
		}
		
	}

}
