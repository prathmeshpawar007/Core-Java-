package Collection;

import java.util.PriorityQueue;

public class Queue_peek_element {

	public static void main(String[] args) {

		PriorityQueue<Integer> p1 = new PriorityQueue();

		p1.add(23);
		p1.add(12);
		p1.add(21);
		p1.add(45);

		System.out.println(p1);
		System.out.println("Peek = " + p1.peek());

		System.out.println("Element = " + p1.element());

	}

}
//	BOTH THE METHODS GIVES SAME VALUE BUT IF OUEUE IS EMPTY THEN
//ELEMENT SHOWS ERROR