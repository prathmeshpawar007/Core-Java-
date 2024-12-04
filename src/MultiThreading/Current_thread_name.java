package MultiThreading;

class demo1 extends Thread {

	public void run() {

		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());

	}

}

public class Current_thread_name {

	public static void main(String[] args) {

		System.out.println("In main");
		System.out.println(Thread.currentThread().getName());
		System.out.println();
		demo1 obj = new demo1();
		obj.start();

	}

}
