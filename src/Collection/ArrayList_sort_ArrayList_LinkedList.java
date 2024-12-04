		package Collection;

import java.util.*;

public class ArrayList_sort_ArrayList_LinkedList {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(20);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(30);

		System.out.println("Unsorted = " + al);

		Collections.sort(al);
		System.out.println("Sorted = " + al);
		System.out.println();

		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add(40);
		ll.add(50);
		ll.add(10);
		ll.add(30);

		System.out.println("Unsorted = " + ll);

		Collections.sort(ll);
		System.out.println("Sorted = " + ll);

	}

}
