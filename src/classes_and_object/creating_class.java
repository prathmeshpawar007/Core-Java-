package classes_and_object;

class demo {

	int a;

	void pp() {
		System.out.println(a);
	}
}

public class creating_class {

	public static void main(String[] args) {

		demo obj = new demo();

		obj.a = 10;
		obj.pp();
		System.out.println(obj.a);

	}

}
