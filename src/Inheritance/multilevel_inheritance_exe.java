package Inheritance;

class bank {

	void bank() {

		System.out.println("Indian Bank");

	}

}

class atm extends bank {

	void atm() {

		System.out.println("Debited 4000");

	}

}

class Costumer extends atm {

	void costumer() {

		System.out.println("Prathmesh Pawar");
	}

}

public class multilevel_inheritance_exe {

	public static void main(String[] args) {

		Costumer obj = new Costumer();
		obj.bank();
		obj.atm();
		obj.costumer();

	}

}
