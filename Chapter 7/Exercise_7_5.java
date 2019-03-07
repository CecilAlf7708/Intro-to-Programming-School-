/* Alfred Thomas Cecil
2/15/19
A program that reads a list of ten given numbers in a list */
import java.util.Scanner;

public class Exercise_7_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] a = new int[10];
		System.out.print("Enter ten whole numbers separated by a space: ");
		for (int i = 0; i < 10; i++){ 
			a[i] = input.nextInt();
			
		}

		int [] group = new int[a.length];
		
		int distinct = 0;

		for (int i = 0;i < a.length; i++){ 
			int currentMin = a[i];
			int currentMinIndex = i;
			
			for(int j = i + 1;j < a.length;j++){
				if (currentMin > a[j]){
					currentMin = a[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i){
				a[currentMinIndex] = a[i];
				a[i] = currentMin;
			}
		
		
		}
		
		group[distinct] = a[0];
		distinct++;
		for (int i = 0; i < a.length-1; i++){
			// (i++ => i) = i+1
			if (a[i] != a[i+1]){
				group[distinct] = a[i+1];
				distinct++;
			}
			
		}
		System.out.println("The number of distinct numbers is " + distinct);
		System.out.print("List without dupicates: ");
		for(int i = 0; i < distinct; i++){
				System.out.print(group[i] + " ");
		}
		

	}
}