package Exception_Handling;

import java.io.FileInputStream;

public class File_Input_Stream_class {

	public static void main(String[] args) {

		ex01 obj1 = new ex01();
		obj1.run();

	}

}

class ex01 {
	public void run() {

		try {
			FileInputStream obj = new FileInputStream("C:\\Users\\prath\\OneDrive\\Documents");

		} catch (Exception E) {

			System.out.println("File Not Found");
		}

	}

}
