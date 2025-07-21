class AreaCalculator{
	public void area(double radius) {
		double area1=3.14*radius*radius;
		System.out.println("Area of circle is: "+ area1);
 	}
	public void area(double l,double b) {
		double area1=l*b;
		System.out.println("Area of rectangle is: "+ area1);
	}
	public void area(float base,float height) {
		float area1=0.5f*base*height;
		System.out.println("Area of triangle is : "+ area1);
	}
	public void area(int side) {
		int areaofsquare=side*side;
		System.out.println("Area of square is "+areaofsquare);
	}
}
public class Overloading {
	public static void main(String[] args) {
		AreaCalculator calc=new AreaCalculator();
		calc.area(3.45);
		calc.area(35);
		calc.area(3.14f,3.14f);
		calc.area(37.45);
		calc.area(3.100,3.100);
	}

}
