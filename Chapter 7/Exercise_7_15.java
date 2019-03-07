/* Alfred Thomas Cecil
2/28/19
A program that removes duplicates from a list of numbers */
import java.util.Scanner;

public class Exercise_7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] list = new int[10];
		System.out.print("Enter ten whole numbers separated by a space: ");
		for (int i = 0; i < 10; i++){ 
			list[i] = input.nextInt();
			
		}
		int[] list2 = eliminateDuplicates(list);
		System.out.print("List without dupicates: ");
		for(int i = 0; i < list2.length; i++){
			System.out.print(list2[i] + " "); 
		}		
		
	}		
		
	public static int[] eliminateDuplicates(int[] list) { 
		int[] array = new int[list.length];
		int distinct = 0;
		
		for (int i = 0; i < list.length; i++){
			// (i++ => i) = i+1
			boolean isInArray = false;
			for (int j = 0; j < array.length;j++){
				if (list[i] == array[j])
					isInArray = true;
			}
			
			if (!isInArray){
			   array[distinct] = list[i];
			   distinct++;
			   //System.out.print(list[i]);
			}
			/*if (array[i] != array[i+1]){
				array[distinct] = array[i+1];
				distinct++;*/
		}

		int[] result = new int[distinct];
		for (int i = 0; i < distinct; i ++) {
			result[i] = array[i];
		}
		//System.out.println("The number of distinct numbers is " + distinct);
		return result;
	}
	
		
	
	
}	
		
				
	
/*for (int i = 0;i < a.length; i++){ 
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
		
		
		}*/

                                                                                                                       