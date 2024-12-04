package Collection;

import java.util.HashSet;
import java.util.LinkedList;

public class Similar_in_arrayList_and_HashSet {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(10);
		ll.add(20);
		ll.add(null);
		ll.add(null);
		System.out.println("ArrayList : " + ll);

		HashSet h1 = new HashSet();

		h1.add(10);
		h1.add(20);
		h1.add(10);
		h1.add(20);
		h1.add(null);
		h1.add(null);

		System.out.println("HashSet : " + h1);

	}

}
		