/* Alfred Thomas Cecil
1/15/19
A program that displays an integer between 1 and 15 up to the integer that is selected by the user in the form of a pyramid*/
import java.util.Scanner;


public class Exercise_5_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 15: ");
		int lines = input.nextInt();
		if (lines < 1 || lines > 15){
			System.out.print("This number is not acceptable.");
		}
				
		else{
		
		
		
		
		
		
		//int lines = 0;
		int count = 0;
		int select = lines;			
			for	(int row = 1; row <= lines; row++){
								
				for (int col = 1; col <= lines - row; col++){
					System.out.print("   ");			
													
					}
				for (int num = row; num >= 1; num--){
					System.out.printf("%3d", num);
					
				}
				for (int num = 2; num <= row; num++){
					System.out.printf("%3d", num);
				}	
					System.out.println();
				
				}
				
			}
					
		
		
		
	}
}