/* Alfred Thomas Cecil
12/20/18
A program to solve a 2 * 2 Algebra equation */

import java.util.Scanner;

public class Exercise_3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a numaric value for letter a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter a numaric value for letter b: ");
		double b = input.nextDouble();
		
		System.out.print("Enter a numaric value for letter c: ");
		double c = input.nextDouble();
		
		System.out.print("Enter a numaric value for letter d: ");
		double d = input.nextDouble();
		
		System.out.print("Enter a numaric value for letter e: ");
		double e = input.nextDouble();	
				
		System.out.print("Enter a numaric value for letter f: ");
		double f = input.nextDouble();
		
		if ((a * d) - (b * c) == 0){
		  System.out.println("The equation has no soution.");
		}
		else {		
		  double x = (e * d) - (b * f) / (a * d) - (b * c);
		  double y = (a * f) - (e * c) / (a * d) - (b * c);
		System.out.print("The results for the letters x and y are " + x + " and " + y);
		
 		}		
	}
}