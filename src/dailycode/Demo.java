package dailycode;

import java.util.*;

public class Demo {


	public static void main(String[] args) 
	{
		//easy.16
		 new Visit().f1(null);
	        new Visit().f1(new Object());
	        new Visit().f1(new String());
    }
}

class Visit {
    public void f1(Object o1) {
        System.out.println("Visited Object");
    }
    public void f1(String s) {
        System.out.println("Visited String");
    }
}