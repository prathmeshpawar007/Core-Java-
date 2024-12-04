package Collection;

import java.util.PriorityQueue;

public class Queue_contains_remove_equals {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue();

		p1.add(23);
		p1.add(12);
		p1.add(21);
		p1.add(45);

		p1.remove(45);
		System.out.println(p1);

		System.out.println(p1.contains(90));// check that element is available or not

		PriorityQueue p2 = new PriorityQueue();
		p2.addAll(p1);

		System.out.println(p1.equals(p2));

	}

}
//			BOTH THE METHODS GIVES SAME VALUE BUT IF OUEUE IS EMPTY THEN
// REMOVE SHOWS ERROR
