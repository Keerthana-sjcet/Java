class Calculator{
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of two integers is: "+ sum);
 	}
	public void add(int a,int b,int c) {
		int sum=a+b+c;
		System.out.println("Sum of three integers is: "+ sum);
	}
	public void add(double a,double b) {
		double sum=a+b;
		System.out.println("Sum of two doubles is: "+ sum);
	}
	public void add(String a,int b) {
		 String concatsum=a+b;
		System.out.println(concatsum);
	}
}
public class Overloading {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add(3,4);
		calc.add(3,4,5);
		calc.add(3.14,3.14);
		calc.add("Abc",4);
		calc.add(37,4);
		calc.add("KGP ",4);
	}

}
