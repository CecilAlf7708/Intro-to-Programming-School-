/* Alfred Thomas Cecil
1/4/2019
A small program that tells the number of days of a selected month */

import java.util.Scanner;

public class Exercise_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first three letters of desired month: ");
		String month = input.nextLine();
		System.out.print("Please enter the current year: ");
		double year = input.nextDouble();

		if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") || month.equals("Oct") || month.equals("Dec")){
			System.out.print("There are 31 days in this month.") ;
		}
		else if (month.equals("Apr")|| month.equals("Jun") || month.equals("Sep") || month.equals("Nov")){
			System.out.print("There are 30 days in this month.");
		}
		else if (month.equals("Feb")){
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
				System.out.print("There are 29 days in this month this year.");
			}	
			else{
				System.out.print("There are 28 days in this month.");
			}
		}	
		else {	
			System.out.print("I'm sorry, that input is invalid.");
		}
	}
}