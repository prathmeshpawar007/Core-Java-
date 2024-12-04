package If_Else;

import java.util.*;

public class If_else_Total_salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base salary : ");
		int basesalary = sc.nextInt();
		int HRA;
		int DA;

		if (basesalary < 10000) {
			HRA = (basesalary * 20) / 100;
			DA = (basesalary * 80) / 100;
		} else if (basesalary < 20000) {

			HRA = (basesalary * 25) / 100;
			DA = (basesalary * 90) / 100;
		} else {
			HRA = (basesalary * 30) / 100;
			DA = (basesalary * 95) / 100;
		}

		int salary = basesalary + HRA + DA;
		System.out.println("Salary is : " + salary);

	}

}
