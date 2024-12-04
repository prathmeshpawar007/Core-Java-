package Static;

public class static_variable {

	int eid;
	String name;
	static String Company = "hefshine";

	static_variable(int eid, String name) {
		this.eid = eid;
		this.name = name;

	}

	void display() {

		System.out.println("E id : " + eid + "\nName : " + name + "\nCompany : " + Company);

	}

	public static void main(String[] args) {

		static_variable obj = new static_variable(101, "PP");
		static_variable obj1 = new static_variable(102, "VK");
		obj.display();
		obj1.display();

	}

}
