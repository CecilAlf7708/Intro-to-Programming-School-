/* Alfred Thomas Cecil
2/26/19
A program that find the smallest number out of ten given numbers */
import java.util.Scanner;

public class Exercise_7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [] array = new double[10];		
		System.out.print("Please enter ten numbers seperated by a space: ");
		for (int i = 0; i < 10; i++){
			array[i] = input.nextDouble();
		}
		
		System.out.print(" The minimum number is: " + min(array));
		
	}
	
	
	
	public static double min(double[] array){
		double smallest = array[0];
		for (int i = 1; i < array.length; i++){
			if (array[i] < smallest){
				smallest = array[i];
				 
			}

		}
		
		
		
		return smallest;
	}
}