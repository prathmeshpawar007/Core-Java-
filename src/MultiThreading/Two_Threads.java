package MultiThreading;

import java.util.Iterator;

class demo4 implements Runnable {

	public void run() {

		for (int i = 0; i <= 3; i++) {

			System.out.println(Thread.currentThread().getName());

		}

	}
}

public class Two_Threads {

	public static void main(String[] args) {

		demo4 obj = new demo4();
		Thread t1 = new Thread(obj);
		t1.setName("First");
		t1.start();

		demo4 obj2 = new demo4();
		Thread t2 = new Thread(obj2);
		t2.setName("Second");
		t2.start();

	}

}
