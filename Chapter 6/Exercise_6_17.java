/* Alfred Thomas Cecil
1/24/19
A test program that displays a n-by-n matrix */
import java.util.Scanner;


public class Exercise_6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a whole number: ");
		int sq_num = input.nextInt();
		int row = 1;
		int total = 0;
		
		
		for (row = 1; row <= sq_num; row++){
			System.out.print((int)(Math.random() * 2) + " ");
			for (total = 2; total <= sq_num; total++){
				System.out.print((int)(Math.random() * 2) + " ");
				if (total == sq_num){
					System.out.println("");
				}
			}		
		}
	}
}