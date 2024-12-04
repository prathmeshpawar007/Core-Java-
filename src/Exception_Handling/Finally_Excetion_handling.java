package Exception_Handling;

public class Finally_Excetion_handling {

	public static void main(String[] args) {

		System.out.println("ID PASS TO DATABASE");
		try {
			System.out.println("DATA READ / DATA PROCESSING" + 10 / 0);
		} catch (ArithmeticException AE) {
			System.out.println(AE);
		} finally { 
			System.out.println("TO CLOSE THE DATABASE");
		}
	}
	

}

//FINALLY BLOCK IS USED FOR CLOSE THE DATABASE BECAUSE IF WE USED 
//LOGIC OF CLOSING DATABASE IN CATCH BLOCK AND IF EXCEPTION IS NOT 
//OCCURS THEN DATABASE WILL NOT BE CLOSED AND THIS IS WHY THE FINALLY 
//BLOCK IS DESCOVERD
