/* Alfred Thomas Cecil
1/29/19
A program that displays a given number and width */
import java.util.Scanner;


public class Exercise_6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		System.out.print("Please enter a width: ");
		int width = input.nextInt();
		
		System.out.print(format(number,width));
		
	}

	public static String format(int number, int width) {
		String s1 = number + "";
		for(int i = 0; i < width - (length(number)); i++){
			s1 = "0" + s1;	
		}
		return s1;
	}

	public static int length(int number){
		int size = 0;
		while(number > 0){
			size++;
			number = number / 10;
			
		}
		return size;
	}





}