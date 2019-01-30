/* Alfred Thomas Cecil
1/23/19
A program that reads and tells if a number is a palindrome or not */
import java.util.Scanner;


public class Exercise_6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.println("Please enter a number to test: ");
		int num1 = input.nextInt();
		isPalindrome(num1);
		
		System.out.println(num1 + " " + isPalindrome(num1));
		
	}
	
	public static int reverse(int number) {
		int reverse = 0;
		while(number != 0){
			int last = number % 10;
			number = number / 10;
			reverse = (reverse * 10) + last;
			
		} 
		return reverse;
	}
	
	public static boolean isPalindrome(int number) { 
		int reverse = reverse(number);
		if (reverse == number){
			return true;
		} 
		else {
			return false;
		}

	}
}	