package OOP_object_creation;

class area_of_all{
	
	
	void area1(int side) {
		
		int area=side*side;
		System.out.println("Area of Square : "+area);
		
	}
	void area1(int l,int b) {
		
		int area =l*b;
		System.out.println("Area of rectangle : "+area);
		
	}
	void area1(double a,int b , int h) {
		
		double area=a*b*h;
		System.out.println("Area of triangle : "+area);
		
	}
	
	
	
}




public class areas {

	public static void main(String[] args) {
		area_of_all demo=new area_of_all();
		demo.area1(10);
		demo.area1(10, 15);
		demo.area1(0.5, 10, 8);


	}

}
