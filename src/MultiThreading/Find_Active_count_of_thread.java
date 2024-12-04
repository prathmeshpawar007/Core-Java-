package MultiThreading;

import Array.max_in_2d_array;

class demo5 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().activeCount());
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class Find_Active_count_of_thread {

	public static void main(String[] args) {

		demo5 t1 = new demo5();
		t1.setName("First Thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		demo5 t2 = new demo5();
		t2.setName("Second Thread");
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		demo5 t3 = new demo5();
		t3.setName("Third Thread");
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();

	}

}
