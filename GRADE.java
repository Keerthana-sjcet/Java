package demo;
import java.util.Scanner;
public class Grades {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your mark:");
		int mark =sc.nextInt();
		if (mark>=90) {
			System.out.println("Grade S");
		}
		else if (mark>=80) {
			System.out.println("Grade A");
		}
		else if (mark>=70) {
			System.out.println("Grade B");
		}
		else if (mark>=60) {
			System.out.println("Grade C");
		}
		else if (mark>=50) {
			System.out.println("Grade D");
		}
		else {
			System.out.println("Grade F");
		}
		sc.close();
	}
}
