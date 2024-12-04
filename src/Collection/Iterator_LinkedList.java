package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterator_LinkedList {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(40);
		ll.add(30);
		ll.add(20);
		ll.add(10);

		System.out.println(ll);

		Iterator i = ll.listIterator(1);

		while (i.hasNext()) {

			System.out.println(i.next());

		}
		System.out.println();

		Iterator j = ll.descendingIterator();

		while (j.hasNext()) {

			System.out.println(j.next());

		}

	}

}
