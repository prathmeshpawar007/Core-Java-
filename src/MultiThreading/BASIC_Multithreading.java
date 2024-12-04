package MultiThreading;

class one extends Thread {

	public void run() {

		System.out.println("In run");
		get1();
		get2();

	}

	void get1() {

		System.out.println("In get1");
	}

	void get2() {

		System.out.println("In get2");
	}

}

public class BASIC_Multithreading {

	public static void main(String[] args) {

		one obj = new one();
		obj.start();

	}

}
