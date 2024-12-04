package Interface;

public class Implement_by_eclips implements one11, two22 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("In display");
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		System.out.println("In get");
	}

	@Override
	public void get2() {
		// TODO Auto-generated method stub
		System.out.println("In get2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implement_by_eclips obj = new Implement_by_eclips();
		obj.show();
		obj.display();
		obj.get();
		obj.get2();

	}

}
