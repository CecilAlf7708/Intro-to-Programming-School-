/* Alfred Thomas Cecil
1/3/2019
A program to calculate the area of a pentagon*/

import java.util.Scanner;

public class Exercise_4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Please enter the length for the center to the vertex: ");
		double length = input.nextDouble();
		
		double side = (2 * length) * Math.sin(Math.PI/5);
		
		double area = (5 * (Math.pow(side,2))) / (4 * Math.tan(Math.PI/5));
		
		System.out.print("The area of the pentagon is: " + area);
	}
}