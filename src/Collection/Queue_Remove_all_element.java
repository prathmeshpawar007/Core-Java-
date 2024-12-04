package Collection;

import java.util.PriorityQueue;

public class Queue_Remove_all_element {

	public static void main(String[] args) {

		PriorityQueue pl = new PriorityQueue();

		pl.add(10);
		pl.add(29);
		pl.add(30);
		pl.add(39);
		pl.add(57);
		System.out.println(pl);
		
		pl.clear();
		System.out.println();
		System.out.println(pl);

	}

}
