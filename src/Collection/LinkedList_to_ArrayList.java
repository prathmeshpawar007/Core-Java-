package Collection;
import java.util.*;

public class LinkedList_to_ArrayList {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);

		System.out.println("LinkedList : "+ll);
		
		ArrayList al= new ArrayList(ll);
		System.out.println("ArrayList : "+al);
	
	}

}
