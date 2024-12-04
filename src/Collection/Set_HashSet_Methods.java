package Collection;

import java.util.HashSet;

public class Set_HashSet_Methods {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(10);
		hs.add("PP");
		System.out.println(hs);
		System.out.println();

		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1 = (HashSet<Integer>) hs.clone();
		System.out.println(hs1);

		System.out.println(hs1.size());

	}

}
