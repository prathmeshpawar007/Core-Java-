package classes_and_object;

class employee1 {

	int id, pin;
	String name, address;

}

public class employee {

	public static void main(String[] args) {

		employee1 obj = new employee1();
		int x = obj.id = 101;
		int y = obj.pin = 415002;
		String str = obj.name = "Prathmesh Pawar";
		String str2 = obj.address = "Satara";
		System.out.println("Id is = " + x + "\nName is = " + str + "\nAddress is = " + str2 + "\nPin is = " + y);

	}

}
