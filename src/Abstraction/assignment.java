package Abstraction;

abstract class shape {

	abstract void size();
}

	class Trapezoid extends shape {
		void size() {

			System.out.println("Trapezoid has 4 size");
		}

	}

	class Triangle extends shape {

		void size() {
			System.out.println("Triangle has 3 Size");

		}

	}

	class Hexagon extends shape {

		void size() {
			System.out.println("Hexagon has 6 Size");

		}

	}

public class assignment {

	public static void main(String[] args) {

		Trapezoid obj = new Trapezoid();
		
		obj.size();
		Triangle obj1 = new Triangle();
		obj1.size();
		Hexagon obj2 = new Hexagon();
		obj2.size();

	}

}
