
package oops;
class Student{
	String name;
    int rollNumber;
	static int studentCount=0;
	
	Student(String name,int rollNumber){
		this .name=name;
		this .rollNumber=rollNumber;
		studentCount+=1;
	}
	
	public static void displayStudentCount() {
		System.out.println("Number of students:"+studentCount);
	}
}
public class Staticdmo {
	public static void main(String[] args) {
		Student student1=new Student("Kgp",67);
		Student student2=new Student("Kg",67);
		Student student3=new Student("K,",67);
		Student.displayStudentCount();
	}
}
