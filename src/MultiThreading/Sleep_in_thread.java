package MultiThreading;

class demo67 extends Thread {

	public void run() {
		
		for (int i = 0; i < 3; i++) {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}

	}
}

public class Sleep_in_thread {

	public static void main(String[] args) {

		demo67 obj1 = new demo67();
		obj1.start();
		demo67 obj2 = new demo67();
		obj2.start();
		
	}

}
