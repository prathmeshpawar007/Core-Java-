package dailycode;

public class Ternary_operator {

	public static void main(String[] args) {

		int a = 15;
		int b = 13;
		int result;

		result = a > b ? a : b;
		System.out.println(result);
		int nestedternary = 10 > 6 ? (6 > 12 ? 10 : 6) : (12 > 10 ? 12 : 10);
		System.out.println(nestedternary);

	}

}

//here first we have to check the condition if it is true then 
//exicutes the left part of the semicolon if it is wrong then 
//execute theright part of the semicolon