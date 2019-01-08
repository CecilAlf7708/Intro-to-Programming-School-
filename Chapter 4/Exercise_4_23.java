/* Alfred Thomas Cecil
1/4/19
A program to create a payroll statement based off of given information */

import java.util.Scanner;

public class Exercise_4_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter employee's name: ");
		String name = input.nextLine();
		
		System.out.print("Please enter number of hours worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Please enter hourly pay rate e.g. 9.75: ");
		double rate = input.nextDouble();
		
		System.out.print("Please enter federal tax withholding rate e.g. 0.20: ");
		double federal = input.nextDouble();
		
		System.out.print("Please enter state tax withholding rate e.g. 0.09: ");
		double state = input.nextDouble();
		
		double gross = (hours * rate); 
		
		double fed_hold = (gross * federal);
		
		double state_hold = (gross * state);
		
		double deduct = (fed_hold + state_hold);
		
		double net = (gross - deduct);
		
		System.out.println("Employee Name: " + name);
		
		System.out.println("Hours Worked: " + hours);
		
		System.out.println("Pay Rate: " + rate);
		
		System.out.printf("Gross Pay: %.2f\n" , gross);
		
		System.out.println("Deductions:");		
		System.out.printf("        Federal Withholding (%.1f%%): %.2f\n", federal * 100, fed_hold);
		System.out.printf("        State Withholding (%.1f%%): %.2f\n" ,state * 100 , state_hold);		
		System.out.printf("        Total Deduction: %.2f\n", deduct);
		
		System.out.printf("Net Pay: %.2f\n" , net);
	}
}