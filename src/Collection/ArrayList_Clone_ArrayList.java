package Collection;
import java.util.ArrayList;
import java.util.TreeSet;

public class ArrayList_Clone_ArrayList {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(11);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList(al);
		
		
		System.out.println(al2);
		

		
	}

}
