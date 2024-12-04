package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class File_Input_Stream{

	public static void main(String[] args)  {

		dev01 obj1 = new dev01();

		try {
			obj1.read();
		} catch (Exception E) {
			System.out.println(E);

		}

	}

}

class dev01 {

	public void read() throws FileNotFoundException , ArrayIndexOutOfBoundsException,
	                          ArithmeticException,NullPointerException{

		FileInputStream F1 = new FileInputStream("C:\\Users\\prath\\OneDrive\\Documents\\file.txt");
		FileInputStream F2 = new FileInputStream("C:\\Users\\prath\\Downloads\\"
				                                 + "WhatsApp Image 2024-10-02 at 9.35.18 AM.jpeg");
	}

}
