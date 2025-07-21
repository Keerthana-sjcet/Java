class Student{
	int rollNumber;
	String name;
	String dept;
	
	
	Student(){
		rollNumber=1;
		name="KGP";
		dept="dept1";
		
	}
	Student (int rollNumber){
		this.rollNumber=rollNumber;
	}
	Student(int rollNumber,String name){
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNumber);
		System.out.println(dept+"\n");
 	}
	
}
public class Task5 {
	public static void main(String[] args) {
		Student stud=new Student();
		stud.display();
		Student student=new Student(5);
		student.display();
		Student student2=new Student(5,"keerthana");
		student2.display();
	}

}
