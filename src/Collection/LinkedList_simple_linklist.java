package Collection;

import java.util.LinkedList;

public class LinkedList_simple_linklist {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add("PP");
		ll.offer(20);
		ll.offer("PP");
		ll.remove(3);
		ll.add(2, "PP");

		System.out.println(ll);

	}

}
//List = Interface
//LinkedList = Class
//ArrayList = Class