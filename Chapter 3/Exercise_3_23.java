/* Alfred Thomas Cecil
1/2/19
A small program to find and determine if coordinates are within a rectangle */

import java.util.Scanner;

public class Exercise_3_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a width: ");
		double width = input.nextDouble();
		
		System.out.print("Please enter a height: ");
		double height = input.nextDouble();
		
		if (width > 10 || height > 5) {
		System.out.print(width + "," + height + " is not in the rectangle.");}
		else {
			System.out.print(width + "," + height + " is in the rectangle.");
		}
	}
}