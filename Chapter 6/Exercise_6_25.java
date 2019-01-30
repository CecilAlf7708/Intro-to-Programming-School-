/* Alfred Thomas Cecil
1/28/19
A program that returns hours, minutes, and seconds from a given set of milliseconds*/
import java.util.Scanner;
//1000 mil = 1 sec
// 1 mil = 0.001 sec
public class Exercise_6_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a time in milliseconds e.g. 1000: ");
		int milliseconds = input.nextInt();
		convertMilliseconds(milliseconds);
		if ( milliseconds < 1000){
			System.out.println("Sorry that is too low.");
		}
	
	}	
		
	public static void convertMilliseconds(int milliseconds){
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		while (milliseconds >= 1000) {
		milliseconds -= 1000;
		seconds++;
			if (seconds == 60){
				seconds = 0;
				minutes++;
				if (minutes == 60){
					minutes = 0;
					hours++;
				}
			}
			
		}
		System.out.print(milliseconds+" is "+ hours +" hours, "+minutes+" minutes, and "+ seconds +" seconds");

	}
		
		
		
	
}