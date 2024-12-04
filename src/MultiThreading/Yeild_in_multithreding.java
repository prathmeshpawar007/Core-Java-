package MultiThreading;

class demo7 extends Thread {

	public void run() {

		System.out.println(Thread.currentThread().getName());

	}

}

public class Yeild_in_multithreding {

	public static void main(String[] args) {
		//it does not give us guarantee that it will work always
		Thread.yield();//Use to provide priority to other before current thread 
		System.out.println(Thread.currentThread().getName());
		demo7 obj = new demo7();
		obj.stop();//use to stop current thread
		obj.start();
		

		demo7 obj1 = new demo7();
		obj1.start();

	}

}
