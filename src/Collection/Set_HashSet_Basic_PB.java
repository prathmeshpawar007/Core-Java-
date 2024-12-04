package Collection;

import java.util.HashSet;

public class Set_HashSet_Basic_PB {

	public static void main(String[] args) {
		int ele = 33;
		HashSet h1 = new HashSet();

		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(ele);
		System.out.println("h1 = " + h1);
		System.out.println(h1.isEmpty());

		HashSet h2 = new HashSet();
		h2.addAll(h1);
		
		System.out.println("h2 = " + h2);
		
		System.out.println(h1.containsAll(h2));

		h1.retainAll(h2);
		System.out.println(h1);

		System.out.println("Size of h2 = " + h2.size());

		h1.clear();

	}

}
