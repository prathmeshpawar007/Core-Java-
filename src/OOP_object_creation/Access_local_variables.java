package OOP_object_creation;

import java.util.Scanner;
class student1{
		
		int rollno;
		String name;
		long contno;
		int totalmarks;
		
		void inputdata(int a,String n,long c,int m) {
			rollno=a;
			name=n;
			contno=c;
			totalmarks=m;
			
			
		}
	void printdata() {
		
		System.out.println("rollno : "+rollno);
		System.out.println("name : "+name);
		System.out.println("contact no : "+contno);
		System.out.println("Total marks : "+totalmarks);
		
	}
	
	
}




public class Access_local_variables {


	public static void main(String[] args) {
		student1 obj5=new student1();
		obj5.inputdata(101,"PP",7301694007l,45);
		obj5.printdata();
		

	}

}

