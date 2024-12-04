package Static;

public class static_block {

	int eid;
	String name;
	static String company;
	static
	{
		System.out.println("In static");
		company = "hefshine";
	}

	static_block(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	void display() {

		System.out.println("E id : " + eid + "\nName : " + name + "\nCompany : " + company);

	}

	public static void main(String[] args) {

		static_block obj = new static_block(101, "PP");
		obj.display();

	}

}
