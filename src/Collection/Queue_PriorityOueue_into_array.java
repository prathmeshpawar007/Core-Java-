package Collection;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Queue_PriorityOueue_into_array {

	public static void main(String[] args) {
		PriorityQueue pl = new PriorityQueue();

		pl.add(10);
		pl.add(29);
		pl.add(30);
		pl.add(39);
		pl.add(57);
		System.out.println(pl);
		ArrayList al = new ArrayList();
		al.addAll(pl);
	System.out.println(al);
	
		
		pl.toArray();
		

		
		

	}

}
