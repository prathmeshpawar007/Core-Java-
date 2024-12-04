package Interface;

interface s1 {
	public static final int c = 55;

	void square();

	private void gun() {
		System.out.println("Private");

	}

	default void show() {
		this.gun();
	}

}

interface s2 {

	float f = 3.3f; // if we initialise any variable in interface it becomes final we can't change
					// it if we does inheritance
 
	public void sub();
}

public class initialise_variable implements s1, s2 {

	public void square() {

		System.out.println(c * c);

	}

	public void sub() {
		int x = 90;
		int y = 40;
		System.out.println(x - y);
	}

	public static void main(String[] args) {

		initialise_variable obj = new initialise_variable();
		obj.square();
		obj.sub();
		obj.show();

	}

}
