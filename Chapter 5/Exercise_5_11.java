/* Alfred Thomas Cecil
1/14/19
A program that finds numbers between 100 and 200 that are divisible by 5 or 6 but not both*/



public class Exercise_5_11 {
	public static void main(String[] args) {
		
		
		
		int num = 100;
		int count = 0;
		for  (num = 100; num <= 200; num++)  {
			if (num % 6 == 0 && num % 5 == 0){
				//System.out.print(num + " ");
			}			
			
			else if (num % 6 == 0 || num % 5 == 0){
				System.out.print(num + " ");
				count++;
			}
			if (count == 10){
				count = 0;
				System.out.println(" ");
				
			}
		}
		 	/*for (num == 5 || num == 6;) {
		if (num == 5 || num == 6 )
	    System.out.print("this works.");
	} 	
	
	*/}
}
