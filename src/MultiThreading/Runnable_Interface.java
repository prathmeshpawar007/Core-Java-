package MultiThreading;

//import java.lang.*;
class demo2 implements Runnable {
	void get() {
		System.out.println("In get");
	}

	public void run() {

		System.out.println("In run");
		get();

	}
}

public class Runnable_Interface {

	public static void main(String[] args) {
		demo2 obj = new demo2();
		Thread obj2 = new Thread(obj);
		obj2.start();

	}

}
