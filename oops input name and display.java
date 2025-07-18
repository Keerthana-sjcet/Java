import java.util.Scanner;
class Student {
	String name;
	int rollno;
	String department;
	Student(String name,int rollno,String department){
		this.name=name;
		this.rollno=rollno;
		this.department=department;
	}

public void printStudentinfo() {
	System.out.println("Name: \t"+name);
	System.out.println("Rollno:\t"+rollno);
	System.out.println("Dept:\t"+department);
}
}
public class OOPSDEMO1 {
	public static void main(String[] args) {
		String name;
		int rollno;
		String department;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter rollno");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter department");
		department=sc.nextLine();
		Student student=new Student(name,rollno,department) ;
		student.printStudentinfo();
	}
}
