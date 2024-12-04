package Collection;

import java.util.LinkedList;

public class LinkedList_peek {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll);

		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());

		System.out.println(ll);
		System.out.println();
		
	}

}
