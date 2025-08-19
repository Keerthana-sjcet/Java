import java.util.Vector;
public class Vectordemo {
	public static void main(String[] args) {
		Vector <String> mammals=new Vector <>();
		Vector <Integer> rollno=new Vector <>();
		rollno.add(1);
		rollno.add(2);
		System.out.println("rollnos:" +rollno);
		rollno.remove(0);
		System.out.println("rollnos:" +rollno);
		rollno.remove(0);
		System.out.println("rollnos:" +rollno);
    	rollno.get(2);
		System.out.println("rollnos:" +rollno);

		}
}
