package OOP_object_creation;

import java.util.*;

class student {

	int rollno;
	String name;
	long contno;
	int totalmarks;

	void inputdata() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rollno : ");
		rollno = sc.nextInt();
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter contno : ");
		contno = sc.nextLong();
		System.out.println("Enter total marks : ");
		totalmarks = sc.nextInt();

	}

	void printdata() {

		System.out.println("rollno : " + rollno);
		System.out.println("name : " + name);
		System.out.println("contact no : " + contno);
		System.out.println("Total marks : " + totalmarks);

	}

}

public class StudentData {

	public static void main(String[] args) {
		student obj5 = new student();
		obj5.inputdata();
		obj5.printdata();

	}

}
