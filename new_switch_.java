package question1;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
		System.out.println("enter the grade");
		String grade = scanner.nextLine();
		String result=switch (grade) {
			case "S" ->"Outstanding";
			case "A+" -> "Excellent";
			case "A" -> "Very good";
			case "B+" -> "Good";
			case "B" -> "Above average";
			case "C" -> "Average";
			case "P" -> "Pass";
			case "F" -> "Fail";
			default -> "invalid code";
	};
	
	System.out.println("result:" +result);
	}
}
