package Collection;

import java.util.PriorityQueue;

public class Queue_poll_remove {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue();

		p1.add(23);
		p1.add(12);
		p1.add(21);
		p1.add(45);

		System.out.println("Poll = " + p1.poll());
		System.out.println(p1);

		System.out.println("Remove = " + p1.remove());
		System.out.println(p1);

	}

}
//		BOTH THE METHODS GIVES SAME VALUE BUT IF OUEUE IS EMPTY THEN
// REMOVE SHOWS ERROR