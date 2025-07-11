/* Description  :   Java Program to read the a number check if it is palindrome or not
 * Author       :   Keerthana G Pillai
 * Version      :   1.0
 * Date         :   11-07-2025
*/

package question1;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int rem,origin=number;
		int rev=0;
		while (number >0) {
			rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		if (origin==rev) {
			System.out.println(" It is a Palindrome");
		}
		else {
			System.out.println(" It is not a Palindrome");
		}
	sc.close();
	}
}
