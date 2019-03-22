/* Alfred Thomas Cecil
3/15/19
A program that can display 512 possible combinations in a 3 by 3 matrix */
import java.util.Scanner;

public class Exercise_8_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number between 0 and 511: ");
		int number = input.nextInt();
		
		convert(number);		
		
	}
	
	public static void convert(int number){
		int[][] array = new int[3][3];
		int[] remainder = new int[9];
		int count = 8;
		while(number > 0){
			remainder[count] = number%2;
			number = number / 2;
			count--;
		}
		
		for(int i = 0; i < remainder.length; i++){
			array[0][0] = remainder[0];
			array[0][1] = remainder[1];
			array[0][2] = remainder[2];			
			array[1][0] = remainder[3];			
			array[1][1] = remainder[4];			
			array[1][2] = remainder[5];
			array[2][0] = remainder[6];
			array[2][1] = remainder[7];
			array[2][2] = remainder[8];
		}
			
			for(int row = 0; row < array.length; row++){
				for (int col = 0; col < array.length; col++){
					if (array[row][col] == 0){
						System.out.print("H ");
					}
					else { System.out.print("T ");
					}
					//System.out.print(array[row][col]);
					
				}
				System.out.println();
			}
		
		
			
		
		
		
	}
}