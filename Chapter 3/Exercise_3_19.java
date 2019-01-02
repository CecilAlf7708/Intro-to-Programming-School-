/* Alfred Thomas Cecil
12/20/18
A program to read and compute the perimeter of a triangle */

import java.util.Scanner;

public class Exercise_3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for edge A: ");
		double a = input.nextDouble();
		
		System.out.print("Enter a value for edge B: ");
		double b = input.nextDouble();		
		
		System.out.print("Enter a value for edge C: ");
		double c = input.nextDouble();		
		
		if ((a + b < c) || (a + c < b) || (b + c < a)){
		System.out.print("The inputs are invalid.");
		}
		else{
		  
		System.out.print("The perimeter of your triangle is: " + (a + b + c));	
		}
	}
}